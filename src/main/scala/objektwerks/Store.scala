package objektwerks

import com.typesafe.scalalogging.LazyLogging

import os.Path

import upickle.default.{read => readJson, write => writeJson}

final class Store extends LazyLogging:
  os.makeDir.all( buildTodoPath )

  private val todoPath = buildTodoPath

  logger.info("Initialized store.")

  private def buildTodoPath: Path = os.home / ".todo"

  def listTodos: List[Todo] =
    logger.info(s"List todos.")
    os.list(todoPath)
      .filter { path => path.baseName.nonEmpty }
      .map { path => readTodo(s"${path.baseName}.json") }
      .toList

  def readTodo(file: String): Todo =
    val todoAsJson = os.read(todoPath / file)
    logger.info(s"Read todo: $file")
    readJson[Todo](todoAsJson)