export type Result<E, T> = Success<E, T> | Failure<E, T>

interface ResultOperators<E, T> {
  map<U>(fun: (t: T) => U): Result<E, U>

  flatMap<U>(fun: (t: T) => Result<E, U>): Result<E, U>

  isSuccess(): this is Success<E, T>

  isFailure(): this is Failure<E, T>
}

class Success<E, T> implements ResultOperators<E, T> {
  constructor(readonly value: T) {
  }

  flatMap<U>(fun: (t: T) => Result<E, U>): Result<E, U> {
    return fun(this.value);
  }

  map<U>(fun: (t: T) => U): Result<E, U> {
    return success(fun(this.value));
  }

  isSuccess(): this is Success<E, T> {
    return true;
  }

  isFailure(): this is Failure<E, T> {
    return false;
  }
}

class Failure<E, T> implements ResultOperators<E, T> {
  constructor(readonly error: E) {
  }

  flatMap<U>(fun: (t: never) => Result<E, U>): Result<E, U> {
    return this;
  }

  map<U>(fun: (t: never) => U): Result<E, U> {
    return this;
  }

  isSuccess(): this is Success<E, T> {
    return false;
  }

  isFailure(): this is Failure<E, T> {
    return true;
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
