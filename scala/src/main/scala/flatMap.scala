import com.jambit.practicalresult.*

@main def flatMap: Unit =
  val flatMapped: Either[String, List[Int]] =
    Right(4).flatMap(listService)
            .flatMap(list => if (list.isEmpty) Left("Empty list")
                             else Right(list))

  println(flatMapped)