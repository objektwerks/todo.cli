package objektwerks

import com.typesafe.scalalogging.LazyLogging

object App extends LazyLogging:
  val store = Store()

  @main
  def list(): Unit =
    log("list todos")

  @main
  def add(todo: String): Unit =
    log(s"add todo: $todo")

  @main
  def completed(id: Int): Unit =
    log(s"todo completed: $id")

  def log(message: String): Unit =
    println(message)
    logger.info(message)