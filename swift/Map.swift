
func map() {
    printName()
    
    let result = listService(4)

    print(result)

    let mapped = result
        .map { $0.reversed() }
        .map { $0.map(String.init).joined(separator: "-") }

    print(mapped)
}
