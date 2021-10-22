
func flatMap() {
    printName()
    
    let flatMapped: Result<[Int], String> = Result.success(4)
        .flatMap(listService)
        .flatMap { list in
            (list.isEmpty) ? .failure("Empty list") : .success(list)
        }

    print(flatMapped)
}
