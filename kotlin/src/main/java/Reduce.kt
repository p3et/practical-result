import arrow.core.Either
import arrow.core.flatMap

fun main() {
    val results: List<Either<String, List<Int>>> = listOf(2, -1, 4).map(listService)

    val reduced: Either<String, List<Int>> =
        results.reduce { result1, result2 ->
            result1.flatMap { list1 ->
                result2.map { list2 -> list1 + list2 }
            }
        }

    println(reduced)
}