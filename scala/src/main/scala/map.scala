import com.jambit.practicalresult.*

@main def map: Unit =
  val result: Either[String, Seq[Int]] = listService(4)

  println(result)

  val mapped: Either[String, String] = result.map(list => list.reverse)
                                             .map(list => list.mkString("-"))

  println(mapped)