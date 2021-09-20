import com.jambit.practicalresult.*

import scala.util.{Left, Right}

@main def recover: Unit =
  val result: Either[String, List[Int]] = listService(-1)

  println(result)

  val recovered: Either[String, List[Int]] = result match {
    case Left(a) => Right(List())
    case Right(b) => result
  }

  println(recovered)