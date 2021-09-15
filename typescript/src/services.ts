import {failure, Result, success} from "./result";

export type MapService<T> = (t: T) => Result<String, T>

export const byTwo: MapService<number> = i => success(i * 2)

export const plusOneIfEven: MapService<number> = i => i % 2 != 0
    ? failure("I don't like odds!")
    : success(i + 1)
