
func recover() {
    printName()

    let result = listService(-1)

    print(result)

    let recovered = result.recover(with: [])

    print(recovered)
}

extension Result {

    func recover(with defaultValue: Success) -> Result<Success, Failure> {
        switch self {
        case .success: return self
        case .failure: return .success(defaultValue)
        }
    }
}
