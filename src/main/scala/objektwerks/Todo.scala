package objektwerks

import java.time.Instant

object Todo:
  def datetime(): String = Instant.now.toString

final case class Todo(id: Int,
                      todo: String,
                      created: String = datetime(),
                      completed: String = "")
