import arrow.core.Either

fun main() {
  val result: Either<String, List<Int>> = listService(-1)

  println(result)

  val recovered: Either<String, List<Int>> = when (result) {
    is Either.Right -> result
    is Either.Left  -> Either.Right(emptyList())
  }

  println(recovered)
}