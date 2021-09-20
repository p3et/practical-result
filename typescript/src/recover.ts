import {Result, success} from "./result";
import {listService} from "./listService";

const result: Result<String, number[]> = listService(-1)

console.log(result)

const recovered: Result<String, number[]> = result.recover(msg => success([]))

console.log(recovered)
