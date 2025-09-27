# https://www.codeabbey.com/index/task_view/linear-function

def itaration(total):
    chain = ""  # Cadena para almacenar los resultados
    for i in range(total):
        data = input()  # Recibir datos
        separate = data.split(" ")  # Separar los datos
        # Asignar variables x1, y1, x2, y2
        x1, y1, x2, y2 = int(separate[0]), int(separate[1]), int(separate[2]), int(separate[3])
        # Llamar a la funcion y concatenar
        chain += f"{find_linear_equation(x1, y1, x2, y2)} "
    # Imprimir resultados
    print(chain)
    
def find_linear_equation(x1, y1, x2, y2):
    a = (y2 - y1) // (x2 - x1)
    b = y1 - a * x1
    return f"({a} {b})"

def main():
    # recibir primer dato y Llamar a la funcion iteration
    receive = int(input())
    itaration(receive)

if __name__ == "__main__":
    main()