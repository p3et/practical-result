import {isFailure, isSuccess, Result} from "./result";
import {listService} from "./listService";

const results: Result<string, number[]>[] = [2, -1, 4].map(listService)

const rights: number[][] = results.filter(isSuccess)
                                  .map(success => success.value)

console.log(rights)

const lefts: string[] = results.filter(isFailure)
                               .map(failure => failure.error)

console.log(lefts)