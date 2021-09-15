export type Result<E, T> = Success<T> | Failure<E>

interface ResultOperators<E, T> {
    map<U>(fun: (t: T) => U): Result<E, U>

    flatMap<U>(fun: (t: T) => Result<E, U>): Result<E, U>

    isSuccess(): this is Success<T>

    isFailure(): this is Failure<E>
}

class Success<T> implements ResultOperators<never, T> {
    constructor(readonly value: T) {
    }

    flatMap<U>(fun: (t: T) => Result<never, U>): Result<never, U> {
        return fun(this.value);
    }

    map<U>(fun: (t: T) => U): Result<never, U> {
        return success(fun(this.value));
    }

    isSuccess(): this is Success<T> {
        return true;
    }

    isFailure(): this is Failure<never> {
        return false;
    }
}

class Failure<E> implements ResultOperators<E, never> {
    constructor(readonly error: E) {
    }

    flatMap<U>(fun: (t: never) => Result<E, U>): Result<E, never> {
        return this;
    }

    map<U>(fun: (t: never) => U): Result<E, never> {
        return this ;
    }

    isSuccess(): this is Success<never> {
        return false;
    }

    isFailure(): this is Failure<E> {
        return true;
    }
}

export function success<E, T>(value: T): Result<E, T> {
    return new Success(value);
}

export function failure<E, T>(error: E): Result<E, T> {
    return new Failure(error);
}