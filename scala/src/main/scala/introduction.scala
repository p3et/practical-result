import com.jambit.practicalresult.*

@main def introduction: Unit =
  val result: Either[String, Int] = plusOneIfEven(2)

  val msg: String = result match {
    case Right(i) => s"Yippie, we got $i!"
    case Left(msg) => msg
  }

  println(msg)