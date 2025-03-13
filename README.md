Todo CLI
--------
Todo command line app using MainArgs, Os-lib, uPickle and Scala 3.

Build
-----
1. ```sbt clean compile```

Test
----
1. ```sbt clean test```

Run
---
1. ```sbt "run list"```

Assembly
--------
1. ```sbt clean test assembly```

Commands
--------
1. list --state : ```sbt "run list --state all"```
2. add --todo : ```sbt "run add --todo drink beer"```
3. complete --id : ```sbt "run complete --id 1"```
>The command ```list --state``` accepts ```all``` ( the default ), ```completed``` and ```incomplete```
* ```list --state all | completed | incomplete```
>Since the default is: ```--state all```, this also works:
* ```list```

Execute
-------
1. ```java -jar target/scala-3.7.0-RC1/todo-cli-0.2-SNAPSHOT.jar list --state all```
2. ```java -jar target/scala-3.7.0-RC1/todo-cli-0.2-SNAPSHOT.jar add --todo drink beer```
3. ```java -jar target/scala-3.7.0-RC1/todo-cli-0.2-SNAPSHOT.jar complete --id 1```

Resources
---------
* [MainArgs Github](https://github.com/com-lihaoyi/mainargs?tab=readme-ov-file#varargs-parameters)
* [Os-Lib Github](https://github.com/com-lihaoyi/os-lib)