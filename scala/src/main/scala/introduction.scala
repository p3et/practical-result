import com.jambit.practicalresult.*

@main def introduction: Unit =
  val result: Either[String, Seq[Int]] = sequenceService(1)

  val msg: String = result match {
    case Right(seq) => seq.mkString("-")
    case Left(msg) => msg
  }

  println(msg)