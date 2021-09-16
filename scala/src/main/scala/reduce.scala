import com.jambit.practicalresult.*

@main def reduce: Unit =
  val results: List[Either[String, List[Int]]] = List(2, -1, 4).map(listService)

  val reduced: Either[String, List[Int]] = results.reduce(
    (result1, result2) => result1.flatMap(list1 => result2.map(list2 => list1 ++ list2))
  )

  println(reduced)