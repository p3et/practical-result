package com.jambit.practicalresult;

import io.vavr.collection.List;
import io.vavr.control.Either;

public class FlatMap {

  public static void main(String[] args) {
    final Either<String, List<Integer>> flatMapped = Either
      .<String, Integer>right(4)
      .flatMap(ListService::get)
      .flatMap((list) -> list.isEmpty() ? Either.left("Empty list")
                                        : Either.right(list));

    System.out.println(flatMapped);
  }
}
