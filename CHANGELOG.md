# Changelog

Все заметные изменения в репозитории `BALLUUNN/startgrowingup-contracts` фиксируются в этом файле.

Формат основан на [Keep a Changelog](https://keepachangelog.com/ru/1.0.0/),
и этот проект придерживается [Semantic Versioning](https://semver.org/lang/ru/).

## Release Policy

### Как выбирать версию

- `PATCH` — правки документации, CI, release automation, комментариев, локальной генерации и других изменений, не меняющих публичный protobuf-контракт.
- `MINOR` — обратно совместимые изменения схемы: новые RPC, новые сообщения, новые поля, новые enum-значения и другие расширения текущей major-версии.
- `MAJOR` — любое breaking change для публичного контракта или переход на новую несовместимую версию API, например `auth/v2`.

### Что считать breaking change

- изменение `package` внутри уже выпущенной версии API;
- изменение номера или типа поля;
- удаление поля или enum-значения без безопасной миграции на новую major-версию;
- изменение семантики существующего RPC так, что старый клиент больше не совместим;
- удаление или несовместимая замена публичного сообщения, сервиса или метода.

### Как оформлять changelog для breaking changes

- в релизной записи используйте явную пометку `BREAKING:` в первом предложении пункта;
- рядом описывайте ожидаемое действие для consumers: новый import path, новый package, новая версия API или шаги миграции;
- если миграция нетривиальна, добавляйте отдельный блок `Migration notes`.

### Как выпускать релиз

1. Убедитесь, что изменения уже в `main` и все обязательные CI checks прошли.
2. Обновите секцию `Unreleased` и подготовьте запись `vX.Y.Z` с финальным списком изменений.
3. Создайте аннотированный тег: `git tag -a vX.Y.Z -m "Release vX.Y.Z"`.
4. Опубликуйте тег: `git push origin vX.Y.Z`.
5. Workflow публикации отправит тот же revision в BSR с тегом `vX.Y.Z`.
6. После публикации проверьте, что на BSR доступны ожидаемые SDK и version strings.

### Как consumers узнают о новой версии

- через этот `CHANGELOG.md`;
- через Git tags и GitHub Releases;
- через BSR tags и generated SDK versions для `buf.build/balluunns/startgrowingup-contracts`.

---

## [Unreleased]

### Changed
- Репозиторий переведен на BSR-first delivery model без хранения generated SDK в Git.
- CI проверяет успешную генерацию и smoke-tests вместо diff по `gen/`.
- Добавлен workflow публикации модуля в BSR по Git tags.
- README и contributor docs обновлены под потребление SDK через BSR.
- README скорректирован по реально доступным BSR SDK package ecosystems для Python и Java.

### Added
- GitHub Release automation с прикрепленным OpenAPI-артефактом.
- GitHub Pages site для OpenAPI-документации.
- Dependabot-конфигурация для GitHub Actions и Go dependencies.

## [1.0.0] - 2025-04-07

### Added
- Создана начальная структура репозитория.
- Добавлен первый proto-файл для сервиса авторизации.
- Добавлена папка `gen/` для сгенерированного кода.
- Созданы конфигурационные файлы для Buf:
  - `buf.yaml` — настройки модуля, линтинга и проверки breaking-изменений.
  - `buf.gen.yaml` — настройки генерации кода для Go.
- Добавлен `Makefile` с командами для автоматизации:
  - `make generate` — генерация кода.
  - `make lint` — запуск линтинга.
  - `make breaking` — проверка на breaking-изменения.

### Changed
- Нормализованы пути репозитория и генерации под `github.com/BALLUUNN/startgrowingup-contracts`.
- Обновлена документация: `README.md`, `STYLE.md`.
- Обновлены локальные команды проверки в `Makefile`.

### Fixed
- Убраны ошибочные Buf overrides, которые ломали имена сгенерированных пакетов (`go_package`).

---
