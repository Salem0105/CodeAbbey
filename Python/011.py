# https://www.codeabbey.com/index/task_view/sum-of-digits


def sum_digits(n):
    div_n = n // 10
    mod_n = n % 10
    if div_n == 0:
        return mod_n
    else:
        return mod_n + sum_digits(div_n)


def itaration(total):
    chain = ""  # Cadena para almacenar los resultados
    for i in range(total):
        data = input()  # Recibir datos
        separate = data.split(" ")  # Separar los datos
        # Asignar variables a, b, c
        a, b, c = (int(separate[0]), int(separate[1]), int(separate[2]))
        number = a * b + c
        # Llamar a la funcion y concatenar
        chain += f"{sum_digits(number)} "
    # Imprimir resultados
    print(chain)


def main():
    # recibir primer dato y Llamar a la funcion iteration
    receive = int(input())
    itaration(receive)


if __name__ == "__main__":
    main()
