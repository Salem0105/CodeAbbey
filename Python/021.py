def cont_trees(a, b):
    cont = {}
    for i in range(int(a[0]) + 1):
        cont[int(b[i])] += 1
    return cont


def iteration():
    data_1 = input().split(" ")
    data_2 = input().split(" ")
    return cont_trees(data_1, data_2)


def main():
    print(iteration())


if __name__ == "__main__":
    main()
