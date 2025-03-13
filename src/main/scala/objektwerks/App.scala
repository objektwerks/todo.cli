package objektwerks

import com.typesafe.scalalogging.LazyLogging

import mainargs.{main, arg, ParserForMethods}

object App extends LazyLogging:
  val store = Store()

  @main
  def list(): Unit =
    log(s"list todos: ${store.listTodos()}")

  @main
  def add( @arg(doc = "Add todo.") todo: String* ): Unit =
    val newTodo = Todo(id = store.nextId(), todo = todo.tail.mkString(" "))
    store.writeTodo(newTodo)
    log(s"add todo: $newTodo")

  @main
  def completed( @arg(doc = "Completed todo by id.") id: Int): Unit =
    val todo = store.readTodo(s"$id.json")
    store.writeTodo(todo.copy(completed = Todo.datetime()))
    log(s"completed todo: $todo")

  def main(args: Array[String]): Unit =
    ParserForMethods(this).runOrExit(args)

  private def log(message: String): Unit =
    println(message)
    logger.info(message)