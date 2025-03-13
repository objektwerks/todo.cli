package objektwerks

import com.typesafe.scalalogging.LazyLogging

object App extends LazyLogging:
  val store = Store()

  @main
  def list(): Unit = log("list")

  def log(message: String): Unit =
    println(message)
    logger.info(message)