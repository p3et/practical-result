package com.jambit.practicalresult;

import io.vavr.control.Either;

public class Map {

    public static void main(String[] args) {
        final Either<String, Integer> result = Services.plusOneIfEven.apply(2);

        System.out.println(result);

        final Either<String, String> mapped = result.map((i) -> i * 2)
                                                    .map((i) -> String.format("i=%d", i));

        System.out.println(mapped);
    }
}
