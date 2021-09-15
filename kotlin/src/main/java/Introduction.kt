import arrow.core.Either

fun main() {
    val result: Either<String, Int> = plusOneIfEven(3)

    val msg: String = when (result) {
        is Either.Right -> "Yippie, we got ${result.value}!"
        is Either.Left -> result.value
    }

    println(msg)
}