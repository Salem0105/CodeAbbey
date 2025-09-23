# https://www.codeabbey.com/index/task_view/fahrenheit-celsius


# Funcion para determinar el redondeo lejos del 0
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


def itaration(total, receive):
    chain = ""  # Cadena para almacenar los resultados
    for i in range(total):
        data = (int(receive[i + 1]) - 32) * (5 / 9)  # Conversion a Celsius
        # Llamar a la funcion y concatenar
        chain += f"{round_zero(data)} "
    # Imprimir resultados
    print(chain)


# recibir primer dato y Llamar a la funcion principal
receive = input().split(" ")
itaration(int(receive[0]), receive)
