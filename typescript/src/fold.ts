import {listService} from "./listService";
import {Result, success} from "for-comprehension-ts";

const results: Result<number[], string>[] = [2, -1, 4].map(listService)

const zero: Result<number[], string> = success([])

const combination: (collector: Result<number[], string>, next: Result<number[], string>) => Result<number[], string> =
    (collector, next) => collector.flatMap(cList => next.map(nList => cList.concat(nList)))

const combined: Result<number[], string> = results.reduce(combination, zero)

console.log(combined)