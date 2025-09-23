# https://www.codeabbey.com/index/task_view/rounding

# Funcion para determinar el redondeo
def condition(num1, num2, iter):
    # Primero una division normal, para luego evaluar si es positivo o negativo
    if (num1 / num2) > 0:
        # Si es positivo, evaluar si la parte decimal es mayor o igual a 0.5
        if (num1 / num2) % 1 >= 0.5:
            # Redondear hacia arriba
            return (num1 // num2) + 1
        else:
            # Como el que graba, no hace nada
            return num1 // num2
    else:
        # Si es negativo, evaluar si la parte decimal es menor o igual a -0.5
        if (num1 / num2) % 1 <= 0.5:
            # Redondear hacia abajo
            return num1 // num2
        else:
            # Quitar redondeo
            return (num1 // num2) + 1

def itaration(total):
    # Cadena para almacenar los resultados
    chain = ""
    for i in range(total):
        # Recibir datos
        data = input()
        # Separar los datos
        separate = data.split(" ")
        # Llamar a la funcion y agregar el resultado a una variable reuilizable
        add_data = condition(int(separate[0]), int(separate[1]), i)
        chain += f"{add_data} "

    # Imprimir resultados
    print(chain)

# recibir primer dato
receive = int(input())
# Llamar a la funcion
itaration(receive)