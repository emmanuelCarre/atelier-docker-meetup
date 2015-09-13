DATA_CONTAINER = sd-atelier-meetup

.PHONY: all build clean clean-all help init

# By default make command, without argument, call the first target in Makefile. In this case: help
help:
	@echo "Please use \`make <target>' where <target> is one of"
	@echo "    all                           to generate html documentation"
	@echo "    build                         to generate html documentation"
	@echo "    clean                         to remove html documentation"
	@echo "    init -e DOCUMENTS_PATH=<path> to create data container with documentation source. <path> have to be path to source documentation folder"

clean:
	rm -f *.html

clean-all: clean
	docker rm $(DATA_CONTAINER)

all: build

build:
	docker run --rm -it --volumes-from $(DATA_CONTAINER) --workdir=/workspace --entrypoint=asciidoctor asciidoctor/docker-asciidoctor *.adoc

init:
	docker create -v "$(DOCUMENTS_PATH)":$(CURDIR) --name $(DATA_CONTAINER) tianon/true /bin/true
