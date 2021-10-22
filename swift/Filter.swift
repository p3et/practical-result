
func filter() {
    printName()

    let results = [2, -1, 4].map(listService)

    let succeeds: [[Int]] = results.compactMap { try? $0.get() }

    print(succeeds)

    let errors: [String] = results.compactMap { result in
        if case .failure(let error) = result { return error } else { return nil }
    }
    print(errors)
}
