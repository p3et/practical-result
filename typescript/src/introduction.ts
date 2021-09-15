import {plusOneIfEven} from "./services";
import {Result} from "./result";

const result: Result<String, number> = plusOneIfEven(2)

const msg: String = result.isSuccess()
                    ? `Yippie, we got ${result.value}!`
                    : result.error

console.log(msg)