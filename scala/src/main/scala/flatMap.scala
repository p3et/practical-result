import com.jambit.practicalresult.*

@main def flatMap: Unit =
  val flatMapped: Either[String, Seq[Int]] = Right(4).flatMap(listService)
                                                     .flatMap(i => if (i.isEmpty) Left("Empty sequence") else Right(i))

  println(flatMapped)