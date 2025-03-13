Todo CLI
--------
Todo command line app.

Commands
--------
1. list - sbt "run list"
2. add todo - sbt "run add --todo drink beer"
3. completed id - sbt "run completed --id 1"

Build
-----
1. sbt clean compile

Test
----
1. sbt clean test

Run
---
1. sbt "run arg1 arg2 arg3"

Assembly
--------
1. sbt clean test assembly

Execute
-------
1. java -jar target/scala-3.7.0-RC1/todo-cli-0.1-SNAPSHOT.jar list
2. java -jar target/scala-3.7.0-RC1/todo-cli-0.1-SNAPSHOT.jar add --todo drink beer
3. java -jar target/scala-3.7.0-RC1/todo-cli-0.1-SNAPSHOT.jar completed --id 1