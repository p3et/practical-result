package com.jambit.practicalresult;

import io.vavr.collection.List;
import io.vavr.control.Either;

public class ListService {

  public static Either<String, List<Integer>> get(int length) {
    return length < 0 ? Either.left("Length must be > 0!")
                      : Either.right(List.range(0, length));
  }

}
