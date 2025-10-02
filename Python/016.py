def round_zero(data):
    # Primero una division normal, para luego evaluar si es positivo o negativo
    if data > 0:
        # Si es positivo, evaluar si la parte decimal es mayor o igual a 0.5
        if data % 1 >= 0.5:
            # Redondear lejos de 0
            return int(data) + 1
        else:
            # No hacer nada
            return int(data)
    else:
        # Si es negativo, evaluar si la parte decimal es menor o igual a -0.5
        if data % -1 <= -0.5:
            return int(data) - 1
        else:
            return int(data)


def average(data):
    sum = 0
    for i in range(len(data) - 1):
        sum += int(data[i])
    return sum / (len(data) - 1)


def itaration(index):
    chain = ""  # Cadena para almacenar los resultados
    for i in range(index):
        data = input().split(" ")  # Recibir y separar datos
        chain += f"{round_zero(average(data))} "
    return chain


def main():
    index = int(input())
    print(itaration(index))


if __name__ == "__main__":
    main()
