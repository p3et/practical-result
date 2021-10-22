//
//  main.swift
//  Result
//
//  Created by Roman Gille on 21.10.21.
//

func printName(methodName: String = #function) {
    print("\nRunning \(methodName):")
}

let result = listService(4)

let message: String = {
    switch result {
    case .success(let list): return list.map(String.init).joined(separator: "-")
    case .failure(let error): return error
    }
}()

print(message)

map()
flatMap()
filter()
fold()
recover()
closure()
