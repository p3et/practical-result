import {Result, success} from "./result";
import {listService} from "./listService";

const results: Result<string, number[]>[] = [2, -1, 4].map(listService);

const zero: Result<string, number[]> = success([]);

const combination : (collector: Result<string, number[]>, next: Result<string, number[]>) => Result<string, number[]> =
  (collector, next) => collector.flatMap(cList => next.map(nList => cList.concat(nList)))

const combined: Result<string, number[]> = results.reduce(combination, zero)

console.log(combined)