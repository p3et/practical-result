export type Result<E, T> = Success<E, T> | Failure<E, T>

interface ResultOperators<E, T> {
  map<U>(fun: (t: T) => U): Result<E, U>

  flatMap<U>(fun: (t: T) => Result<E, U>): Result<E, U>
}

class Success<E, T> implements ResultOperators<E, T> {
  constructor(readonly value: T) {
  }

  map<U>(fun: (t: T) => U): Result<E, U> {
    return success(fun(this.value));
  }

  flatMap<U>(fun: (t: T) => Result<E, U>): Result<E, U> {
    return fun(this.value);
  }
}

class Failure<E, T> implements ResultOperators<E, T> {
  constructor(readonly error: E) {
  }

  map<U>(fun: (t: never) => U): Result<E, U> {
    return this;
  }

  flatMap<U>(fun: (t: never) => Result<E, U>): Result<E, U> {
    return this;
  }
}

export function success<E, T>(value: T): Result<E, T> {
  return new Success(value);
}

export function failure<E, T>(error: E): Result<E, T> {
  return new Failure(error);
}

export function isSuccess<E, T>(result: Result<E, T>): result is Success<E, T> {
  return "value" in result;
}

export function isFailure<E, T>(result: Result<E, T>): result is Failure<E, T> {
  return "error" in result;
}
