package objektwerks

import com.typesafe.scalalogging.LazyLogging

import mainargs.{main, arg, ParserForMethods}

object App extends LazyLogging:
  val store = Store()

  @main
  def list(): Unit =
    log("list todos")

  @main
  def add( @arg(doc = "Add todo.") todo: String* ): Unit =
    log(s"add todo: ${todo.tail.mkString(" ")}")

  @main
  def completed( @arg(doc = "Completed todo by id.") id: Int): Unit =
    log(s"completed todo: $id")

  def main(args: Array[String]): Unit =
    ParserForMethods(this).runOrExit(args)

  private def log(message: String): Unit =
    println(message)
    logger.info(message)