package com.jambit.practicalresult;

import io.vavr.collection.List;
import io.vavr.control.Either;

public class Introduction {

  public static void main(String[] args) {
    final Either<String, List<Integer>> result = ListService.get(3);

    final String msg = result.isRight()
                       ? result.getOrElse(List::empty).mkString("-")
                       : result.getLeft(); // unsafe!

    System.out.println(msg);
  }
}
