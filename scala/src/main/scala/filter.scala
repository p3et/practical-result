import com.jambit.practicalresult.*

@main def filter: Unit =
  val results: List[Either[String, List[Int]]] = List(2, -1, 4).map(listService);

  val rights: List[List[Int]] = results.collect { case Right(list) => list }

  println(rights)

  val lefts: List[String] = results.collect { case Left(error) => error }

  println(lefts)
