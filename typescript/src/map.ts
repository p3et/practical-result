import {plusOneIfEven} from "./services";
import {Result} from "./result";

const result: Result<String, number> = plusOneIfEven(2)

console.log(result)

const mapped: Result<String, String> = result.map(i => i * 2)
                                             .map(i => `i=${i}`)

console.log(mapped)
