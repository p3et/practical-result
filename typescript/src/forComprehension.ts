import {listService} from "./listService";
import {For, Result, success} from "for-comprehension-ts";

const result: Result<number[], string> =
    For._("a", () => success(4))
       ._("list1", ({a}) => listService(a))
       ._("list2", ({a}) => listService(a - 2))
       .yield(({list1, list2}) => list1.concat(list2))

console.log(result)