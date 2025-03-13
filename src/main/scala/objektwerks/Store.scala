package objektwerks

import com.typesafe.scalalogging.LazyLogging

import os.Path

import upickle.default.{read => readJson, write => writeJson}

import Todo.given

final class Store extends LazyLogging:
  os.makeDir.all( buildTodosPath() )

  private val todosPath = buildTodosPath()

  logger.info("Initialized store.")

  private def buildTodosPath(): Path = os.home / ".todo" / "data"

  def listTodos: List[Todo] =
    logger.info(s"List todos.")
    os.list(todosPath)
      .filter { path => path.baseName.nonEmpty }
      .map { path => readTodo(s"${path.baseName}.json") }
      .toList

  def readTodo(file: String): Todo =
    val todoAsJson = os.read(todosPath / file)
    logger.info(s"Read todo: $file")
    readJson[Todo](todoAsJson)

  def writeTodo(todo: Todo): Unit =
    val todoAsJson = writeJson(todo)
    os.write.over(todosPath / todo.file, todoAsJson)
    logger.info(s"Write todo: ${todo.id}")