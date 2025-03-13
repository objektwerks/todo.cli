package objektwerks

import java.time.Instant

object Todo:
  given Ordering[Todo] = Ordering.by[Todo, String](t => t.created).reverse

  def datetime(): String = Instant.now.toString

final case class Todo(id: Int,
                      todo: String,
                      created: String = datetime(),
                      completed: String = "")
