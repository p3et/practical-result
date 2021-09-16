import arrow.core.Either

fun main() {
  val result: Either<String, List<Int>> = listService(4)

  println(result)

  val mapped = result
    .map { list -> list.reversed() }
    .map { list -> list.joinToString("-") }

  println(mapped)
}