package com.jambit.practicalresult;

import io.vavr.collection.List;
import io.vavr.control.Either;

public class Recover {

  public static void main(String[] args) {
    final Either<String, List<Integer>> result = ListService.get(-1);

    System.out.println(result);

    final Either<String, List<Integer>> recovered = result.isRight()
                                                    ? result
                                                    : Either.right(List.empty());

    System.out.println(recovered);
  }
}
