# Devolver digitos separados por espacio
def digits(n):
    n = int(n)
    div_n = n // 10
    mod_n = n % 10
    if div_n == 0:
        return mod_n
    else:
        # se vuelve a llamar a la funcion, pero con el cociente
        return f"{digits(div_n)} {mod_n}"


def WSD(x):
    x = str(x)
    str_x = x.split(" ")
    sum = 0
    for i in range(len(str_x)):
        sum += int(str_x[i]) * (i + 1)
    return sum


def itaration(total):
    chain = ""  # Cadena para almacenar los resultados
    data = input().split(" ")  # Recibir y separar datos
    for i in range(total):
        # Calcular suma ponderada y agregar a la cadena
        chain += f"{WSD(digits(data[i]))} "
    # Imprimir resultados
    print(chain)


def main():
    # recibir primer dato y Llamar a la funcion iteration
    receive = int(input())
    itaration(receive)


if __name__ == "__main__":
    main()
