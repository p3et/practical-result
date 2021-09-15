package com.jambit.practicalresult;

import io.vavr.control.Either;

import java.util.function.Function;

public class Services {

    interface Service<T> extends Function<T, Either<String, T>> {
    }

    public static Service<Integer> byTwo = (i) -> Either.right(i * 2);

    public static Service<Integer> plusOneIfEven =
            (i) -> i % 2 != 0 ? Either.left("I don't like odds!")
                              : Either.right(i + 1);
}
