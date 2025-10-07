def vowel(chain):
    cont = 0
    new_list = list(chain)
    for i in range(len(new_list)):
        if new_list[i] in "aeiouAEIOUyY":
            cont += 1
    return cont

def itaration(index):
    chain = ""  # Cadena para almacenar los resultados
    for i in range(index):
        data = input()
        chain += f"{vowel(data)} "
    return chain


def main():
    index = int(input())
    print(itaration(index))


if __name__ == "__main__":
    main()