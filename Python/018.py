def round(number):
    if number % 1 == 0.0:
        return int(number)
    else:
        return number
    

def root(r, x, n):
    new_r = (r + x / r) / 2
    if n > 1:
        return root(new_r, x, n - 1)
    elif n == 1:
        return new_r
    else:
        return 1


def itaration(index):
    chain = ""  # Cadena para almacenar los resultados
    for i in range(index):
        data = input().split(" ")  # Recibir y separar datos
        chain += f"{round(root(1, int(data[0]), int(data[1])))} "
    return chain


def main():
    index = int(input())
    print(itaration(index))


if __name__ == "__main__":
    main()
