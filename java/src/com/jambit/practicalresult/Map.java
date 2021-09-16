package com.jambit.practicalresult;

import io.vavr.collection.List;
import io.vavr.control.Either;

public class Map {

    public static void main(String[] args) {
        final Either<String, List<Integer>> result = ListService.get(2);

        System.out.println(result);

        final Either<String, String> mapped = result.map(List::reverse)
                                                    .map((list) -> list.mkString("-"));

        System.out.println(mapped);
    }
}
