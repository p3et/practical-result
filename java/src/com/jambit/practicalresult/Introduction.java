package com.jambit.practicalresult;

import io.vavr.control.Either;

public class Introduction {

    public static void main(String[] args) {
        final Either<String, Integer> result = Services.plusOneIfEven.apply(3);

        final String msg = result.isRight()
                           ? String.format("Yippie, we got %d!", result.get()) // unsafe!
                           : result.getLeft(); // unsafe!

        System.out.println(msg);
    }
}
