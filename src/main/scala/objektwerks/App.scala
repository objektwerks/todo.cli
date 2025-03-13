package objektwerks

import com.typesafe.scalalogging.LazyLogging

import mainargs.{main, arg, ParserForMethods}

object App extends LazyLogging:
  val store = Store()

  @main
  def list( @arg(short = 'l', doc = "List todos.") dummy: Int = 0 ): Unit =
    log("list todos")

  @main
  def add(todo: String): Unit =
    log(s"add todo: $todo")

  @main
  def completed(id: Int): Unit =
    log(s"todo completed: $id")

  def main(args: Array[String]): Unit =
    ParserForMethods(this).runOrExit(args)

  private def log(message: String): Unit =
    println(message)
    logger.info(message)