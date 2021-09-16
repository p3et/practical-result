import arrow.core.Either

fun main() {
  val result: Either<String, List<Int>> = listService(4)

  val msg: String = when (result) {
    is Either.Right -> result.value.joinToString("-")
    is Either.Left  -> result.value
  }

  println(msg)
}