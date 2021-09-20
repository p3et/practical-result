import com.jambit.practicalresult.*

@main def closure: Unit =
  val result: Either[String, List[Int]] =
    Right(4)
      .flatMap(a => listService(a)
        .flatMap(list1 => listService(a - 2)
          .map(list2 => list1 ++ list2)))

  println(result)