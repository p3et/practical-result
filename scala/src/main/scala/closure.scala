import com.jambit.practicalresult.*

@main def closure: Unit =
  val pyramid: Either[String, List[Int]] =
    Right(2)
      .flatMap(a => listService(a)
        .flatMap(list1 => listService(a * 2)
          .map(list2 => list1 ++ list2)))

  println(pyramid)