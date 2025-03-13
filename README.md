Todo CLI
--------
Todo cli app.

Commands
--------
1. list
2. add -text
3. completed -id

Build
-----
1. sbt clean compile

Run
---
1. sbt "run arg1 arg2 arg3"

Assembly
--------
1. sbt clean compile assembly

Execute
-------
1. java -jar ./target/todo-cli-$version.jar ( or double-click executable jar )