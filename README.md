# StartGrowingUp Contracts

Репозиторий `BALLUUNN/startgrowingup-contracts` хранит protobuf-контракты StartGrowingUp и публикует их в Buf Schema Registry как модуль `buf.build/balluunns/startgrowingup-contracts`.

Source of truth в репозитории - файлы `.proto`. Каталог `gen/` используется только как локальный output для проверки генерации и не является каноническим способом доставки SDK потребителям.

## Что внутри

- исходные `.proto`-контракты в `proto/`;
- конфигурация генерации и проверки через `buf`;
- локальная генерация SDK для Go, Python, Java и TypeScript;
- OpenAPI-артефакт, собранный из protobuf-аннотаций;
- документация по стилю и процессу внесения изменений.

Сейчас в репозитории опубликован домен `auth/v1`.

## Структура

```text
.
├── proto/
│   └── auth/
│       └── v1/
│           ├── auth.proto
│           └── README.md
├── buf.yaml
├── buf.gen.yaml
├── Makefile
├── README.md
├── CONTRIBUTING.md
├── STYLE.md
├── site/
│   └── index.html
└── CHANGELOG.md
```

## Локальная работа

Перед полным `make verify` или `make check` должны быть установлены:

- `buf` `1.71.0`
- `go`
- `python3`
- `node` и `npm`
- `javac` и `mvn`

Быстрая самопроверка окружения:

```bash
make doctor
```

Основные команды:

```bash
make doctor
make format
make generate
make test-generated
make verify
make check
```

Аналоги через `buf`:

```bash
buf format -w
buf lint
buf breaking --against 'https://github.com/BALLUUNN/startgrowingup-contracts.git#branch=main'
buf generate
```

Файлы в `gen/` не редактируются вручную. В обычной разработке они служат локальным output для smoke-проверок, а для версионируемой доставки consumers должны использовать BSR или release assets, описанные ниже.

Если нужен только быстрый schema-loop без всех language smoke-тестов, достаточно:

```bash
make lint
make breaking
make generate
```

## Локальные generated outputs

После `buf generate` обновляются:

- `gen/go/auth/v1`
- `gen/python/auth/v1`
- `gen/java/com/balluunn/startgrowingup/auth/v1`
- `gen/typescript/auth/v1`
- `gen/openapi/api.swagger.json`

Эти артефакты нужны для smoke-проверок, локальной разработки и валидации generation pipeline. Основной путь доставки для published SDK - BSR. Для экосистем, где BSR install flow пока неполный, используются versioned GitHub Release bundles.

## Использование через BSR

Основной модуль:

```text
buf.build/balluunns/startgrowingup-contracts
```

BSR генерирует SDK для каждого опубликованного коммита и тега. Для production лучше пинить зависимость на конкретную версию, label или commit, а не оставлять `latest`.

Ниже приведены примеры, которые я сверил с реально доступными BSR package ecosystems для этого модуля. Если на вкладке `SDKs` BSR команда отличается, ориентируйтесь на BSR UI как на источник истины.

### Go

Для этого модуля публичный Go SDK из BSR в автоматической проверке не разрешился через `go list` и `@v/list`, поэтому здесь оставлен только формат пути из документации Buf:

```text
buf.build/gen/go/balluunns/startgrowingup-contracts/{pluginOwner}/{pluginName}
```

Перед публикацией consumer-инструкций для Go проверьте точную install-команду на вкладке `SDKs` в BSR. Если нужен надежный BSR-first сценарий для Go, может потребоваться отдельно пересмотреть `go_package` strategy.

Пока BSR-flow для Go не зафиксирован, versioned fallback - asset `startgrowingup-contracts-<tag>-go.tar.gz` в GitHub Releases.

### Python

Добавьте BSR Python index:

```ini
[global]
extra-index-url = https://buf.build/gen/python
```

Установка:

```bash
pip install balluunns-startgrowingup-contracts-protocolbuffers-python
pip install balluunns-startgrowingup-contracts-grpc-python
```

Проверенные package names:

```text
balluunns-startgrowingup-contracts-protocolbuffers-python
balluunns-startgrowingup-contracts-grpc-python
```

Для production фиксируйте версию в `requirements.txt` или lock-файле.

### Java

Добавьте BSR Maven registry:

```xml
<repositories>
  <repository>
    <id>buf</id>
    <url>https://buf.build/gen/maven</url>
  </repository>
</repositories>
```

Формат координат:

```xml
<dependency>
  <groupId>build.buf.gen</groupId>
  <artifactId>balluunns_startgrowingup-contracts_protocolbuffers_java</artifactId>
  <version>&lt;pinned BSR version&gt;</version>
</dependency>
```

Для gRPC-стабов используйте отдельный артефакт:

```xml
<dependency>
  <groupId>build.buf.gen</groupId>
  <artifactId>balluunns_startgrowingup-contracts_grpc_java</artifactId>
  <version>&lt;pinned BSR version&gt;</version>
</dependency>
```

Для production используйте фиксированную `version`, а не плавающие диапазоны.

### TypeScript

Текущий TypeScript plugin `buf.build/community/stephenh-ts-proto` не привязан к package ecosystem в BSR, поэтому native `npm install` для этого generated SDK сейчас не публикуется. Для TypeScript сейчас поддерживаются два реалистичных варианта:

- использовать versioned release bundle `startgrowingup-contracts-<tag>-typescript.tar.gz`;
- перейти на plugin, для которого BSR публикует npm SDK, если нужен полноценный BSR-first install flow.

### OpenAPI

OpenAPI-файл генерируется локально как `gen/openapi/api.swagger.json`, валидируется в CI, прикладывается к GitHub Release по тегу вместе с архивами generated SDK и публикуется как GitHub Pages site из ветки `main`.

## Правила совместимости

- Внутри текущей версии API нельзя менять `package`, номер поля или тип поля.
- Удаляемые поля сначала резервируются через `reserved`.
- Несовместимые изменения публикуются в новой версии, например `auth/v2`.

## Документация

- [CONTRIBUTING.md](CONTRIBUTING.md)
- [STYLE.md](STYLE.md)
- [proto/auth/v1/README.md](proto/auth/v1/README.md)
- [CHANGELOG.md](CHANGELOG.md)
