package com.jambit.practicalresult

val sequenceService: (length: Int) => Either[String, Seq[Int]] =
  i => if (i < 0) Left("Length must be > 0!")
       else Right(Seq.range(0, i))