import {listService} from "./listService";
import {Result, success} from "for-comprehension-ts";

const result: Result<number[], string> = listService(-1)

console.log(result)

const recovered: Result<number[], string> = result.recover(msg => success([]))

console.log(recovered)
