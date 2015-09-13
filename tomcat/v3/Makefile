IMAGE_NAME = my-tomcat:3

.PHONY: all build clean help

# By default make command, without argument, call the first target in Makefile. In this case: help
help:
	@echo "Please use \`make <target>' where <target> is one of"
	@echo "    all      to build docker image $(IMAGE_NAME)"
	@echo "    build    to build docker image $(IMAGE_NAME)"
	@echo "    clean    to remove docker image $(IMAGE_NAME)"

clean:
	docker rmi $(IMAGE_NAME)

all: build

build:
	docker build --rm -t $(IMAGE_NAME) .
