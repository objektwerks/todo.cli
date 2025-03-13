name := "todo.cli"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.6.4"
libraryDependencies ++= Seq(
  "com.lihaoyi" %% "mainargs" % "0.7.6"
)
scalacOptions ++= Seq(
  "-Wunused:all"
)