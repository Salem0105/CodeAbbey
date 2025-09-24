# https://www.codeabbey.com/index/task_view/arithmetic-progression


def itaration(total):
    chain = ""  # Cadena para almacenar los resultados
    for i in range(total):
        data = input()  # Recibir datos
        separate = data.split(" ")  # Separar los datos
        # Asignar variables a, b, c
        a, b, c = int(separate[0]), int(separate[1]), int(separate[2])
        # Llamar a la funcion y concatenar
        chain += f"{progretion(a, b, c)} "
    # Imprimir resultados
    print(chain)


# Funcion para determinar el n-esimo termino de la progresion aritmetica
def progretion(a, b, c):
    initial = 0
    for i in range(c):
        initial += a + i * b
    return initial


# recibir primer dato y Llamar a la funcion principal
receive = int(input())
itaration(receive)
