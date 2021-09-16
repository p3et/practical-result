import {Result} from "./result";
import {listService} from "./listService";

const result: Result<String, number[]> = listService(4)

console.log(result)

const mapped: Result<String, String> = result.map(list => list.reverse())
                                             .map(list => list.join("-"))

console.log(mapped)
