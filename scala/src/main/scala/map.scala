import com.jambit.practicalresult.*

@main def map: Unit =
  val result: Either[String, Int] = plusOneIfEven(2)

  println(result)

  val mapped: Either[String, String] = result.map(i => i * 2)
                                             .map(i => s"i=$i")

  println(mapped)