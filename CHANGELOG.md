# Changelog

Все заметные изменения в репозитории `BALLUUNN/startgrowingup-contracts` фиксируются в этом файле.

Формат основан на [Keep a Changelog](https://keepachangelog.com/ru/1.0.0/),
и этот проект придерживается [Semantic Versioning](https://semver.org/lang/ru/).

---

## [Unreleased] - 2025-04-07

### Changed
- Репозиторий переведен на BSR-first delivery model без хранения generated SDK в Git.
- CI проверяет успешную генерацию и smoke-tests вместо diff по `gen/`.
- Добавлен workflow публикации модуля в BSR по Git tags.
- README и contributor docs обновлены под потребление SDK через BSR.

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
