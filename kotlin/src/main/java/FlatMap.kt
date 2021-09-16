import arrow.core.Either
import arrow.core.flatMap

fun main() {
    val flatMapped: Either<String, List<Int>> = Either
        .Right(4)
        .flatMap(listService)
        .flatMap { list ->
            if (list.isEmpty()) Either.Left("Empty list")
            else Either.Right(list)
        }

    println(flatMapped)
}