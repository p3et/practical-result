import {listService} from "./listService";
import {Result} from "for-comprehension-ts";

const result: Result<number[], string> = listService(4)

console.log(result)

const mapped: Result<string, string> = result.map(list => list.reverse())
                                             .map(list => list.join("-"))

console.log(mapped)
