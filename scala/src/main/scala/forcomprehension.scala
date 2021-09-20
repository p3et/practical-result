import com.jambit.practicalresult.*

@main def forComprehension: Unit =
  val result: Either[String, List[Int]] =
    for {
      a <- Right(4)
      list1 <- listService(a)
      list2 <- listService(a - 2)
    } yield list1 ++ list2

  println(result)