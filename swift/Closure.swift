
func closure() {
    printName()

    let result  = Result.success(4)
        .flatMap { a in listService(a)
            .flatMap { list1 in listService(a - 2)
                .map { list1 + $0 }
            }
        }

    print(result)
}
