name := "todo.cli"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.6.4"
libraryDependencies ++= Seq(
  "org.scalameta"   %%% "munit"  % "1.1.0" % Test
)
scalacOptions ++= Seq(
  "-Wunused:all"
)