import {failure, Result, success} from "for-comprehension-ts";

export const listService = (length: number): Result<number[], string> =>
    length < 0 ? failure("Length must be > 0!")
               : success([...Array(length).keys()])