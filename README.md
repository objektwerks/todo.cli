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
1. list - sbt "run list --state all"
2. add todo - sbt "run add --todo drink beer"
3. complete id - sbt "run complete --id 1"
>list --state accepts: all, completed, incomplete

Execute
-------
1. java -jar target/scala-3.7.0-RC1/todo-cli-0.1-SNAPSHOT.jar list --state all
2. java -jar target/scala-3.7.0-RC1/todo-cli-0.1-SNAPSHOT.jar add --todo drink beer
3. java -jar target/scala-3.7.0-RC1/todo-cli-0.1-SNAPSHOT.jar complete --id 1