def repeat(n):
    data = input().split(" ")
    if data[0] == "%":
        return n % int(data[1])
    elif data[0] == "+":
        return repeat(n + int(data[1]))
    elif data[0] == "*":
        return repeat(n * int(data[1]))


def iteration():
    data = int(input())  # Recibir y separar datos
    print(repeat(data))


def main():
    iteration()


if __name__ == "__main__":
    main()
