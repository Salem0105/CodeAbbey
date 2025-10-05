def checksum(data):
    sum = 0
    for i in range(len(data)):
        sum = (sum + int(data[i])) * 113
        if sum > 10000007:
            sum %= 10000007
    return sum


def itaration():
    data = input().split(" ")  # Recibir y separar datos
    return checksum(data)


def main():
    index = int(input())
    print(itaration())


if __name__ == "__main__":
    main()
