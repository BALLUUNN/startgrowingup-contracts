# StartGrowingUp Contracts

Репозиторий `BALLUUNN/startgrowingup-contracts` хранит protobuf-контракты и generated outputs для сервисов и клиентов StartGrowingUp.

## Что внутри

- исходные `.proto`-контракты в `proto/`;
- конфигурация генерации и проверки через `buf`;
- generated code для Go, Python, Java и TypeScript;
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
├── gen/
│   ├── go/
│   ├── java/
│   ├── openapi/
│   ├── python/
│   └── typescript/
├── buf.yaml
├── buf.gen.yaml
├── Makefile
├── README.md
├── CONTRIBUTING.md
├── STYLE.md
└── CHANGELOG.md
```

## Локальная работа

Основные команды:

```bash
make format
make generate
make test-go
make verify
```

Аналоги через `buf`:

```bash
buf format -w
buf lint
buf breaking --against 'https://github.com/BALLUUNN/startgrowingup-contracts.git#branch=main'
buf generate
```

Файлы в `gen/` не редактируются вручную.

## Generated outputs

После `buf generate` обновляются:

- `gen/go/auth/v1`
- `gen/python/auth/v1`
- `gen/java/com/balluunn/startgrowingup/auth/v1`
- `gen/typescript/auth/v1`
- `gen/openapi/api.swagger.json`

## Использование

### Go

```bash
go get github.com/BALLUUNN/startgrowingup-contracts
```

```go
import authv1 "github.com/BALLUUNN/startgrowingup-contracts/gen/go/auth/v1"
```

### Python

Python bindings лежат в `gen/python`. Для импорта нужен установленный runtime `protobuf`, а также зависимости generated-кода.

### Java

Java bindings лежат в `gen/java/com/balluunn/startgrowingup/auth/v1`.

### TypeScript

TypeScript bindings лежат в `gen/typescript/auth/v1` и рассчитаны на `@grpc/grpc-js`.

## Правила совместимости

- Внутри текущей версии API нельзя менять `package`, номер поля или тип поля.
- Удаляемые поля сначала резервируются через `reserved`.
- Несовместимые изменения публикуются в новой версии, например `auth/v2`.

## Документация

- [CONTRIBUTING.md](CONTRIBUTING.md)
- [STYLE.md](STYLE.md)
- [proto/auth/v1/README.md](proto/auth/v1/README.md)
- [CHANGELOG.md](CHANGELOG.md)
