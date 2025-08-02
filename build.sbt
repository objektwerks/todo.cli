name := "todo.cli"
organization := "objektwerks"
version := "0.8-SNAPSHOT"
scalaVersion := "3.7.2"
libraryDependencies ++= Seq(
  "com.lihaoyi" %% "mainargs" % "0.7.6",
  "com.lihaoyi" %% "os-lib" % "0.11.5-M10",
  "com.lihaoyi" %% "upickle" % "4.2.1",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
  "ch.qos.logback" % "logback-classic" % "1.5.18",
  "org.scalatest" %% "scalatest" % "3.2.19" % Test
)
scalacOptions ++= Seq(
  "-Wunused:all"
)
assemblyJarName := s"todo-cli-${version.value}.jar"
assembly / assemblyMergeStrategy := {
  case PathList("META-INF", "services", xs @ _*) => MergeStrategy.filterDistinctLines
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}
