import {Result} from "./result";
import {listService} from "./listService";

const result: Result<String, number[]> = listService(4)

const msg: String = result.isSuccess()
                    ? result.value.join("-")
                    : result.error

console.log(msg)