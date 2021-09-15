import com.jambit.practicalresult.*

@main def map: Unit =
  val result: Either[String, Seq[Int]] = sequenceService(2)

  println(result)

  val mapped: Either[String, String] = result.map(seq => seq.reverse)
                                             .map(seq => seq.mkString("-"))

  println(mapped)