package com.jambit.practicalresult

type Service[T] = (t: T) => Either[String, T]

val byTwo: Service[Int] = i => Right(i * 2)

val plusOneIfEven: Service[Int] =
  i => if (i % 2 != 0) Left("I don't like odds!")
       else Right(i + 1)