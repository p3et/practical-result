package com.jambit.practicalresult

val listService: (length: Int) => Either[String, List[Int]] =
  i => if (i < 0) Left("Length must be > 0!")
       else Right(Seq.range(0, i).toList)