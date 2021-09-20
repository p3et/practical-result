import com.jambit.practicalresult.*

@main def introduction: Unit =
  val result: Either[String, List[Int]] = listService(4)

  val msg: String = result match {
    case Right(list) => list.mkString("-")
    case Left(err) => err
  }
  
  println(msg)