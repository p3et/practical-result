package com.jambit.practicalresult;

import io.vavr.collection.List;
import io.vavr.control.Either;

public class Filter {

  public static void main(String[] args) {
    final List<Either<String, List<Integer>>> results =
      List.of(2, -1, 4).map(ListService::get);

    final var rights =
      results.filter(Either::isRight)
             .map(right -> right.getOrElse(List.empty()));

    System.out.println(rights);

    // UNSAFE (compiles but causes runtime errors):
    // results
    //   .filter(Either::isRight)
    //   .map(Either::getLeft);
    final var lefts =
      results.filter(Either::isLeft)
             .map(Either::getLeft);

    System.out.println(lefts);
  }
}
