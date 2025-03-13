package objektwerks

/**
 * To run:
 * 1. sbt "run arg1 arg2 arg3"
 * 
 */
object App:
  def main(args: Array[String]): Unit =
    println(s"App args[${args.length}]:")
    args.foreach(println)