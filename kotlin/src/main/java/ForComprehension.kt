import arrow.core.Either
import arrow.core.computations.either

suspend fun main() {
  val result: Either<String, List<Int>> =
    either {
      val a = Either.Right(4).bind()
      val list1 = listService(a).bind()
      val list2 = listService(a - 2).bind()
      list1 + list2
    }

  println(result)
}