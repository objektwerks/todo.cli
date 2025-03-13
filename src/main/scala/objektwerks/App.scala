package objektwerks

import com.typesafe.scalalogging.LazyLogging

import mainargs.{main, arg, ParserForMethods}

object App extends LazyLogging:
  val store = Store()

  @main(doc = "List todos.")
  def list(): Unit =
    log("list")
    store.listTodos().foreach { todo => log(todo.toString) }

  @main
  def add( @arg(doc = "Add todo.") todo: String* ): Unit =
    val newTodo = Todo(id = store.nextId(), todo = todo.tail.mkString(" "))
    store.writeTodo(newTodo)
    log(s"add --todo $newTodo")

  @main
  def completed( @arg(doc = "Completed todo by id.") id: Int): Unit =
    val todo = store.readTodo(s"$id.json")
    val completedTodo = todo.copy(completed = Todo.datetime())
    store.writeTodo(completedTodo)
    log(s"completed --id $completedTodo")

  def main(args: Array[String]): Unit =
    ParserForMethods(this).runOrExit(args)

  private def log(message: String): Unit =
    println(message)
    logger.info(message)