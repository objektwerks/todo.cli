Todo CLI
--------
Todo command line app using MainArgs, Os-lib, uPickle and Scala 3.

Build
-----
1. sbt clean compile

Test
----
1. sbt clean test

Run
---
1. sbt "run list"

Assembly
--------
1. sbt clean test assembly

Commands
--------
1. list - sbt "run list"
2. add todo - sbt "run add --todo drink beer"
3. completed id - sbt "run completed --id 1"

Execute
-------
1. java -jar target/scala-3.7.0-RC1/todo-cli-0.1-SNAPSHOT.jar list
2. java -jar target/scala-3.7.0-RC1/todo-cli-0.1-SNAPSHOT.jar add --todo drink beer
3. java -jar target/scala-3.7.0-RC1/todo-cli-0.1-SNAPSHOT.jar completed --id 1