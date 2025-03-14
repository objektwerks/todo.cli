Todo CLI
--------
Todo command line app using MainArgs, Os-lib, uPickle and Scala 3.

Build
-----
1. ```sbt clean compile```

Test
----
1. ```sbt clean test```

Assembly
--------
1. ```sbt clean test assembly```

Commands
--------
1. list --filter
2. add --todo
3. complete --id
>The command ```list --filter``` accepts ```all``` ( the default ), ```completed``` and ```incomplete```
* ```list --filter all | completed | incomplete```
>Since the ```list``` default is: ```--filter all```, this also works:
* ```list```

Run
---
1. ```sbt "run list --filter all"```
2. ```sbt "run add --todo drink beer"```
3. ```sbt "run complete --id 1"```

Execute
-------
1. ```java -jar target/scala-3.7.0-RC1/todo-cli-0.3-SNAPSHOT.jar list --filter all```
2. ```java -jar target/scala-3.7.0-RC1/todo-cli-0.3-SNAPSHOT.jar add --todo drink beer```
3. ```java -jar target/scala-3.7.0-RC1/todo-cli-0.3-SNAPSHOT.jar complete --id 1```

Resources
---------
* [MainArgs Github](https://github.com/com-lihaoyi/mainargs?tab=readme-ov-file#varargs-parameters)
* [Os-Lib Github](https://github.com/com-lihaoyi/os-lib)