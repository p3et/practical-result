import arrow.core.Either

fun main() {
    val result: Either<String, Int> = plusOneIfEven(3)

    println(result)

    val mapped = result.map { i -> i * 2 }
                       .map { i -> "i=${i}" }

    println(mapped)
}