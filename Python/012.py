def diff_time(d1, h1, m1, s1, d2, h2, m2, s2):
    # Convertir todo a segundos
    total1 = s1 + (m1 * 60) + (h1 * 3600) + (d1 * 86400)
    total2 = s2 + (m2 * 60) + (h2 * 3600) + (d2 * 86400)
    # Diferencia en segundos
    diff = total2 - total1
    # Convertir de nuevo a d, h, m, s
    days = diff // 86400
    hours = (diff % 86400) // 3600
    minutes = (diff % 3600) // 60
    seconds = diff % 60
    return f"({days} {hours} {minutes} {seconds})"

def itaration(total):
    chain = ""  # Cadena para almacenar los resultados
    for i in range(total):
        data = input()  # Recibir datos
        separate = data.split(" ")  # Separar los datos
        # Asignar variables 
        d1 = int(separate[0])
        h1 = int(separate[1])
        m1 = int(separate[2])
        s1 = int(separate[3])
        d2 = int(separate[4])
        h2 = int(separate[5])
        m2 = int(separate[6])
        s2 = int(separate[7])
        # Llamar a la funcion y concatenar
        chain += f"{diff_time(d1, h1, m1, s1, d2, h2, m2, s2)} "
    # Imprimir resultados
    print(chain)


def main():
    # recibir primer dato y Llamar a la funcion iteration
    receive = int(input())
    itaration(receive)


if __name__ == "__main__":
    main()