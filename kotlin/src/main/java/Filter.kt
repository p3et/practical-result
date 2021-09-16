import arrow.core.Either
import arrow.core.getOrElse

fun main() {
  val results: List<Either<String, List<Int>>> =
    listOf(2, -1, 4).map(listService);

  val rights: List<List<Int>> = results
    .filter { result -> result is Either.Right }
    .map { right -> right.getOrElse { emptyList() } }

  println(rights)

  // UNSAFE (compiles but causes runtime error):
  // results
  //   .filter { result -> result is Either.Left }
  //   .map { right -> (right as Either.Right).value }
  val lefts = results
    .filter { result -> result is Either.Left }
    .map { left -> (left as Either.Left).value }

  println(lefts)
}