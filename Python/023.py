def checksum(data):
    sum = 0
    for i in range(len(data)):
        sum = (sum + int(data[i])) * 113
        if sum > 10000007:
            sum %= 10000007
    return sum


def bubble_array(data):
    cont = 0
    for i in range(1, len(data)):
        if data[i - 1] > data[i]:
            cont += 1
            aux = data[i]
            data[i] = data[i - 1]
            data[i - 1] = aux
    return data, cont


def itaration():
    data = input().split(" ")  # Recibir y separar datos
    return f"{bubble_array(data[:-1])[1]} {checksum(bubble_array(data[:-1])[0])}"


def main():
    print(itaration())


if __name__ == "__main__":
    main()
