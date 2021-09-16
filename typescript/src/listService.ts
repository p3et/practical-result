import {failure, Result, success} from "./result";

export const listService = (length: number): Result<string, number[]> =>
  length < 0 ? failure("Length must be > 0!")
             : success([...Array(length).keys()])