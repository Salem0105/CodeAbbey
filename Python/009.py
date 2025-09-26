#https://www.codeabbey.com/index/task_view/triangles

def is_triangle(a, b, c):
    if a + b > c and a + c > b and b + c > a:
        return 1
    else:
        return 0
    
def main():
    # Recibir primer dato
    receive = int(input())
    chain = ""  # Cadena para almacenar los resultados
    for i in range(receive):
        data = input()  # Recibir datos
        separate = data.split(" ")  # Separar los datos
        # Asignar variables a, b, c
        a, b, c = int(separate[0]), int(separate[1]), int(separate[2])
        # Llamar a la funcion y concatenar
        chain += f"{is_triangle(a, b, c)} "
    # Imprimir resultados
    print(chain)

if __name__ == "__main__":
    main()