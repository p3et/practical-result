import com.jambit.practicalresult.*

@main def fold: Unit =
  val results: List[Either[String, List[Int]]] = List(2, -1, 4).map(listService)

  val zero: Either[String, List[Int]] = Right(List())

  val combination: (Either[String, List[Int]], Either[String, List[Int]]) => Either[String, List[Int]] =
    (collector, next) => collector.flatMap(cList => next.map(nList => cList ++ nList))

  val combined: Either[String, List[Int]] = results.fold(zero)(combination)

  println(combined)