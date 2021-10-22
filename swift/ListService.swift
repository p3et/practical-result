
extension String: Error {}

func listService(_ count: Int) -> Result<[Int], String> {
    count > 0 ?
        .success(Array(0...count)) :
        .failure("Length must be > 0!")
}
