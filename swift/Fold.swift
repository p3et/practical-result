
func fold() {
    printName()
    
    let results = [2, -1, 4].map(listService)
    
    let zero: Result<[Int], String> = .success([])

    let combined = results.reduce(zero) { collector, next in
        collector.flatMap { cList in
            next.map { cList + $0 }
        }
    }

    print(combined)
}
