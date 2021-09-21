import {listService} from "./listService";
import {isSuccess, Result} from "for-comprehension-ts";

const result: Result<number[], string> = listService(4)

const msg: string = isSuccess(result)
                    ? result.value.join("-")
                    : result.error

console.log(msg)