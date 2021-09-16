import arrow.core.Either

val listService: (length: Int) -> Either<String, List<Int>> =
    { length ->
        if (length < 0) Either.Left("Length must be > 0!")
        else Either.Right((0..length).toList())
    }