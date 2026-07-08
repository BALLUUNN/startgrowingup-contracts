BUF ?= buf
BUF_VERSION ?= 1.71.0
GEN_DIR := gen
BREAKING_BRANCH ?= main
REPO_URL ?= https://github.com/BALLUUNN/startgrowingup-contracts.git

UNAME_S := $(shell uname -s)
ifeq ($(UNAME_S),Linux)
    BUF_DOWNLOAD_URL := https://github.com/bufbuild/buf/releases/download/$(BUF_VERSION)/buf-$(UNAME_S)-x86_64
else ifeq ($(UNAME_S),Darwin)
    BUF_DOWNLOAD_URL := https://github.com/bufbuild/buf/releases/download/$(BUF_VERSION)/buf-$(UNAME_S)-x86_64
else
    $(error Unsupported OS: $(UNAME_S). Please install buf manually: https://buf.build/docs/installation)
endif

BUF_INSTALLED := $(shell command -v $(BUF) 2> /dev/null)

COLOR_RESET   := \033[0m
COLOR_INFO    := \033[36m
COLOR_SUCCESS := \033[32m
COLOR_ERROR   := \033[31m
COLOR_WARN    := \033[33m

.PHONY: all
all: verify
	@echo "$(COLOR_SUCCESS)Verification complete.$(COLOR_RESET)"

.PHONY: help
help:
	@echo "$(COLOR_INFO)Available targets:$(COLOR_RESET)"
	@echo "  $(COLOR_WARN)all$(COLOR_RESET)        - Run the default verification flow"
	@echo "  $(COLOR_WARN)setup$(COLOR_RESET)      - Install buf if not present"
	@echo "  $(COLOR_WARN)format$(COLOR_RESET)     - Format proto files in place"
	@echo "  $(COLOR_WARN)generate$(COLOR_RESET)   - Generate code from proto files"
	@echo "  $(COLOR_WARN)lint$(COLOR_RESET)       - Lint proto files"
	@echo "  $(COLOR_WARN)breaking$(COLOR_RESET)   - Check breaking changes against $(BREAKING_BRANCH)"
	@echo "  $(COLOR_WARN)test-go$(COLOR_RESET)    - Compile generated Go bindings"
	@echo "  $(COLOR_WARN)verify$(COLOR_RESET)     - Run local verification"
	@echo "  $(COLOR_WARN)clean$(COLOR_RESET)      - Remove generated code"
	@echo "  $(COLOR_WARN)check$(COLOR_RESET)      - Run full CI-style verification"
	@echo "  $(COLOR_WARN)check-generated$(COLOR_RESET) - Verify buf generate completes cleanly"
	@echo "  $(COLOR_WARN)publish$(COLOR_RESET)    - Push module to Buf Schema Registry"
	@echo "  $(COLOR_WARN)help$(COLOR_RESET)       - Show this help"

.PHONY: setup
setup:
	@echo "$(COLOR_INFO)Checking buf installation...$(COLOR_RESET)"
	@if [ -z "$(BUF_INSTALLED)" ]; then \
		echo "$(COLOR_WARN)buf not found. Downloading and installing...$(COLOR_RESET)"; \
		curl -sSL $(BUF_DOWNLOAD_URL) -o $(BUF) && chmod +x $(BUF); \
		echo "$(COLOR_SUCCESS)buf installed to current directory.$(COLOR_RESET)"; \
		echo "   Add $(shell pwd) to PATH or move $(BUF) to /usr/local/bin"; \
	else \
		echo "$(COLOR_SUCCESS)buf is already installed: $(BUF_INSTALLED)$(COLOR_RESET)"; \
	fi

.PHONY: generate
generate:
	@echo "$(COLOR_INFO)Generating code from protobuf...$(COLOR_RESET)"
	@if [ ! -f "buf.gen.yaml" ]; then \
		echo "$(COLOR_ERROR)buf.gen.yaml not found in current directory.$(COLOR_RESET)"; \
		exit 1; \
	fi
	$(BUF) generate
	@echo "$(COLOR_SUCCESS)Code generation complete.$(COLOR_RESET)"

.PHONY: lint
lint:
	@echo "$(COLOR_INFO)Linting protobuf files...$(COLOR_RESET)"
	$(BUF) lint
	@echo "$(COLOR_SUCCESS)Linting passed.$(COLOR_RESET)"

.PHONY: breaking
breaking:
	@echo "$(COLOR_INFO)Checking backwards compatibility with $(BREAKING_BRANCH)...$(COLOR_RESET)"
	$(BUF) breaking --against '$(REPO_URL)#branch=$(BREAKING_BRANCH)'
	@echo "$(COLOR_SUCCESS)No breaking changes detected.$(COLOR_RESET)"

.PHONY: format
format:
	@echo "$(COLOR_INFO)Formatting protobuf files...$(COLOR_RESET)"
	$(BUF) format -w
	@echo "$(COLOR_SUCCESS)Formatting complete.$(COLOR_RESET)"

.PHONY: clean
clean:
	@echo "$(COLOR_INFO)Removing generated code...$(COLOR_RESET)"
	rm -rf $(GEN_DIR)
	@echo "$(COLOR_SUCCESS)Cleaned.$(COLOR_RESET)"

.PHONY: check
check: lint breaking generate test-go check-generated

.PHONY: test-go
test-go:
	@echo "$(COLOR_INFO)Compiling generated Go bindings...$(COLOR_RESET)"
	go test ./gen/go/...
	@echo "$(COLOR_SUCCESS)Generated Go bindings compile successfully.$(COLOR_RESET)"

.PHONY: verify
verify: lint generate test-go

.PHONY: check-generated
check-generated: generate
	@echo "$(COLOR_INFO)Verifying remote generation finishes without errors...$(COLOR_RESET)"
	@echo "$(COLOR_SUCCESS)buf generate completed successfully.$(COLOR_RESET)"

.PHONY: publish
publish:
	@echo "$(COLOR_INFO)Publishing module to Buf Schema Registry...$(COLOR_RESET)"
	@if [ -n "$(TAG)" ]; then \
		$(BUF) push --tag "$(TAG)"; \
	else \
		$(BUF) push; \
	fi
	@echo "$(COLOR_SUCCESS)Published.$(COLOR_RESET)"

.PHONY: build
build: verify
