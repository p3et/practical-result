import arrow.core.Either

fun main() {
    val results: List<Either<String, List<Int>>> = listOf(2, -1, 4).map(listService);

    val lefts = results
        .filter { result -> result is Either.Left }
        .map { left -> (left as Either.Left).value }

    val rights = results
        .filter { result -> result is Either.Right }
        .map { right -> (right as Either.Right).value }

    println(lefts)
    println(rights)
}