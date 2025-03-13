package objektwerks

import com.typesafe.scalalogging.LazyLogging

object App extends LazyLogging:
  def main(args: Array[String]): Unit =
    println(s"App args[${args.length}]:")
    args.foreach(println)
    logger.info(s"App args[${args.length}]:")
    args.foreach(arg => logger.info(arg))