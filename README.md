# StartGrowingUp Contracts

Репозиторий `BALLUUNN/startgrowingup-contracts` хранит protobuf-контракты StartGrowingUp и публикует их в Buf Schema Registry (BSR). Generated SDK больше не считаются артефактом Git: потребители устанавливают их из BSR через обычные package managers.

## Что внутри

- исходные `.proto`-контракты в `proto/`;
- конфигурация `buf` для lint, breaking-check и локальной remote generation;
- GitHub Actions для CI и публикации в BSR по Git tags;
- документация по совместимости, стилю и релизному процессу.

Сейчас в репозитории опубликован домен `auth/v1`.

## Структура

```text
.
├── .github/workflows/
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
└── CHANGELOG.md
```

## Локальная работа

Быстрый ежедневный сценарий:

1. Измените нужный `.proto`-файл в `proto/`.
2. Запустите локальные проверки:

```bash
make format
make verify
```

3. Если хотите посмотреть локально сгенерированные артефакты, они появятся в `gen/`.
4. Закоммитьте изменения в `.proto`, конфигах и документации.
5. Не добавляйте `gen/` в Git: это временный локальный output.

Основные команды:

```bash
make format
make generate
make test-go
make verify
make clean
make publish TAG=v1.1.0
```

Аналоги через `buf`:

```bash
buf format -w
buf lint
buf breaking --against 'https://github.com/BALLUUNN/startgrowingup-contracts.git#branch=main'
buf generate
buf push --tag v1.1.0
```

`make verify` сейчас запускает `buf lint`, `buf generate` и компиляцию Go bindings через `go test ./gen/go/...`.

`buf.gen.yaml` использует только remote plugins. Каталог `gen/` создается локально для smoke-проверок, ignored через Git и при необходимости очищается через `make clean`.

## Что коммитить

Коммитим:

- `.proto` в `proto/`;
- изменения в `buf.yaml`, `buf.gen.yaml`, `Makefile`, workflow-файлах;
- документацию и changelog.

Не коммитим:

- `gen/`;
- локально скачанный `buf`;
- временные файлы IDE и окружения.

## One-Time BSR Setup

Эти шаги нужно выполнить один раз вне репозитория:

1. Создать организацию и модуль в BSR.
2. Убедиться, что имя в [buf.yaml](buf.yaml) совпадает с BSR-репозиторием.
3. Сгенерировать BSR token для CI/CD.
4. Добавить в GitHub Actions secret `BUF_TOKEN`.

Workflow публикации по тегам уже настроен в [publish.yaml](.github/workflows/publish.yaml).

## Release Flow

1. Обновите [CHANGELOG.md](CHANGELOG.md).
2. Закоммитьте изменения контрактов.
3. Создайте tag вида `v1.2.3`.
4. Push тега запустит `buf push --tag <tag>` в GitHub Actions.

После `buf push` BSR сам публикует generated SDK для поддерживаемых package managers. Отдельные шаги публикации в npm, Go proxy, Maven или PyPI в CI не нужны.

## Consuming SDKs

Точные команды удобнее всего копировать со вкладки `SDKs` в BSR. Ниже shape команд для этого модуля.

### Go

```bash
go get buf.build/gen/go/<org>/startgrowup-contracts/protocolbuffers/go@latest
```

```go
import authv1 "buf.build/gen/go/<org>/startgrowup-contracts/protocolbuffers/go/auth/v1"
```

Для private modules:

```bash
buf registry login
export GOPRIVATE="buf.build/gen/go,${GOPRIVATE}"
```

### npm / TypeScript

```bash
npm config set @buf:registry https://buf.build/gen/npm/v1
npm install @buf/<org>_startgrowup-contracts.community_stephenh-ts-proto
```

Для private modules:

```bash
npm config set //buf.build/gen/npm/v1/:_authToken <token>
```

### Python

```bash
pip install <org>-startgrowup-contracts-protocolbuffers-python
```

### Maven / Gradle

Добавьте BSR Maven repository `https://buf.build/gen/maven` и зависимость вида:

```xml
<dependency>
  <groupId>build.buf.gen</groupId>
  <artifactId><org>_startgrowup-contracts_protocolbuffers_java</artifactId>
  <version><!-- BSR SDK version --></version>
</dependency>
```

## Правила совместимости

- Внутри текущей версии API нельзя менять `package`, номер поля или тип поля.
- Удаляемые поля сначала резервируются через `reserved`.
- Несовместимые изменения публикуются в новой версии, например `auth/v2`.

## Документация

- [CONTRIBUTING.md](CONTRIBUTING.md)
- [STYLE.md](STYLE.md)
- [proto/auth/v1/README.md](proto/auth/v1/README.md)
- [CHANGELOG.md](CHANGELOG.md)
