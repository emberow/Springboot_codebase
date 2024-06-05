# java_code_base

## Init mvn Project
use spring initializr to init spring boot project
https://start.spring.io/

## Build Project
```bash
mvn package
```

## run Project
```bash
mvn spring-boot:run
```

## Debug Mode
use vscode built-in debug mode.

## checkstyle
```bash
mvn checkstyle:check
```

## unit test
It will generate a coverage report at /target/site/jacoco/index.html
``` bash
mvn clean test
```