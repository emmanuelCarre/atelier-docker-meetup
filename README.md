Pour constuire la doc:

```
docker run --rm -it -v "<path to document folder>":/documents/ --entrypoint asciidoctor asciidoctor/docker-asciidoctor atelier.adoc
```
