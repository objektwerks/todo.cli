package objektwerks

import com.typesafe.scalalogging.LazyLogging

import mainargs.{main, arg, ParserForMethods}

object App extends LazyLogging:
  val store = Store()

  @main
  def list( @arg(doc = "List todos by filter [all, completed, incomplete]") filter: String = Filter.all ): Unit =
    log(s"list by filter: $filter")
    val todos = store.listTodos()
    filter match
      case Filter.all => todos.foreach(println)
      case Filter.completed => todos.filter(todo => todo.completed.nonEmpty).foreach(println)
      case Filter.incomplete => todos.filter(todo => todo.completed.isEmpty).foreach(println)

  @main
  def add( @arg(doc = "Add todo.") todo: String* ): Unit =
    val newTodo = Todo(id = store.nextId(), todo = todo.tail.mkString(" "))
    store.writeTodo(newTodo)
    log(s"add --todo: $newTodo")

  @main
  def complete( @arg(doc = "Complete todo by id.") id: Int): Unit =
    val todo = store.readTodo(s"$id.json")
    val completedTodo = todo.copy(completed = Todo.datetime())
    store.writeTodo(completedTodo)
    log(s"completed --id: $completedTodo")

  def main(args: Array[String]): Unit =
    ParserForMethods(this).runOrExit(args)

  private def log(message: String): Unit =
    println(message)
    logger.info(message)