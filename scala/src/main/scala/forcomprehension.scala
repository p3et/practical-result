import com.jambit.practicalresult.*

@main def forComprehension: Unit =
  val pyramid: Either[String, List[Int]] =
    for {
      a <- Right(-2)
      list1 <- listService(a)
      list2 <- listService(a * 2)
    } yield list1 ++ list2

  println(pyramid)