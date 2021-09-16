package com.jambit.practicalresult;

import io.vavr.collection.List;
import io.vavr.control.Either;

import java.util.function.BiFunction;

public class Fold {

  public static void main(String[] args) {
    final List<Either<String, List<Integer>>> results = List.of(2, -1, 4).map(ListService::get);

    final Either<String, List<Integer>> zero = Either.right(List.empty());

    final BiFunction<Either<String, List<Integer>>, Either<String, List<Integer>>, Either<String, List<Integer>>> combination =
      (collector, next) -> collector.flatMap(cList -> next.map(cList::appendAll));

    final Either<String, List<Integer>> combined = results.fold(zero, combination);

    System.out.println(combined);
  }
}
