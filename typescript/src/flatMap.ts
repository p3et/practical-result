import {failure, Result, success} from "./result";
import {listService} from "./listService";

const flatMapped = success(4)
    .flatMap(list => listService(list))
    .flatMap(list => list.length == 0 ? failure("Empty list")
                                      : success(list));

console.log(flatMapped)