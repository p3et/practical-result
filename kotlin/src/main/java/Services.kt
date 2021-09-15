import arrow.core.Either

typealias MapService<T> = (t: T) -> Either<String, T>

val byTwo: MapService<Int> = { i -> Either.Right(i * 2) }

val plusOneIfEven: MapService<Int> = { i ->
    if (i % 2 != 0) Either.Left("I don't like odds!")
    else Either.Right(i + 1)
}