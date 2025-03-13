package objektwerks

import com.typesafe.scalalogging.LazyLogging

object App extends LazyLogging:
  val store = Store()
  
  def main(args: Array[String]): Unit =
    val message = s"App args[${args.length}]:"
    println(message)
    args.foreach(println)
    logger.info(message)
    args.foreach(arg => logger.info(arg))