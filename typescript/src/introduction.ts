import {isSuccess, Result} from "./result";
import {listService} from "./listService";

const result: Result<String, number[]> = listService(4)

const msg: String = isSuccess(result)
                    ? result.value.join("-")
                    : result.error

console.log(msg)