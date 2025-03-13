name := "todo.cli"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.6.4"
mainClass := Some("objektwerks.App")
libraryDependencies ++= Seq(
  "com.lihaoyi" %% "mainargs" % "0.7.6",
  "com.lihaoyi" %% "os-lib" % "0.11.5-M3",
  "com.lihaoyi" %% "upickle" % "4.1.0",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
  "ch.qos.logback" % "logback-classic" % "1.5.17"
)
scalacOptions ++= Seq(
  "-Wunused:all"
)
assemblyJarName := s"todo-cli-${version.value}.jar"
assembly / assemblyMergeStrategy := {
  case PathList("META-INF",  xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}