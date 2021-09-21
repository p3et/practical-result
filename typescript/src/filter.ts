import {listService} from "./listService";
import {isFailure, isSuccess, Result} from "for-comprehension-ts";

const results: Result<number[], string>[] = [2, -1, 4].map(listService)

const rights: number[][] = results.filter(isSuccess)
                                  .map(success => success.value)

console.log(rights)

const lefts: string[] = results.filter(isFailure)
                               .map(failure => failure.error)

console.log(lefts)