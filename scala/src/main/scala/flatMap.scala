import com.jambit.practicalresult.*

@main def flatMap: Unit =
  val flatMapped: Either[String, Seq[Int]] = Right(0).flatMap(sequenceService)
                                                     .flatMap(i => if (i.isEmpty) Left("Empty sequence") else Right(i))

  println(flatMapped)