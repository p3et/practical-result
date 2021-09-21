import {listService} from "./listService";
import {failure, Result, success} from "for-comprehension-ts";

const flatMapped: Result<number[], string> =
    success<number, string>(4)
    .flatMap(list => listService(list))
    .flatMap(list => list.length == 0 ? failure("Empty list")
                                      : success(list));

console.log(flatMapped)