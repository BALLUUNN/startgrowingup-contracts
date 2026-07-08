# Auth Service v1

Этот каталог содержит контракт `auth.v1` для репозитория `BALLUUNN/startgrowingup-contracts`.

## Назначение

Контракт описывает:

- регистрацию по номеру телефона с подтверждением кода;
- вход в систему с двухшаговой проверкой;
- подтверждение email для аутентифицированного пользователя;
- смену номера телефона через challenge-flow;
- обновление и завершение сессии;
- восстановление пароля без раскрытия наличия аккаунта.

## Принципы

- Ошибки возвращаются через gRPC status и HTTP status, а не через `success/message` в payload.
- Защищенные методы получают bearer token через `Authorization` header или gRPC metadata.
- Повторно используемые challenge-сценарии унифицированы через `VerificationChallenge`.
- Успешная аутентификация возвращает `AuthSession` с профилем пользователя и токенами.

## Исходники

- [auth.proto](auth.proto) - основной protobuf-контракт сервиса.

## Generated outputs

Этот контракт публикуется в BSR вместе с generated SDK. Для установки language-specific packages используйте корневой [README.md](../../../README.md) и вкладку `SDKs` в BSR, а не локальный каталог `gen/`.

## Проверка

Из корня репозитория:

```bash
make verify
```
