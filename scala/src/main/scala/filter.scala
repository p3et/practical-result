import com.jambit.practicalresult.*

@main def filter: Unit =
  val results: List[Either[String, List[Int]]] = List(2, -1, 4).map(listService);

  val lefts: Seq[String] = results.collect { case Left(error) => error }
  val rights: Seq[List[Int]] = results.collect { case Right(list) => list }

  println(lefts)
  println(rights)