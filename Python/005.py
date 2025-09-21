#https://www.codeabbey.com/index/task_view/min-of-three

#recibir primer dato
receive = int(input())
chain = ""

for i in range(receive):
    data = input() #recibir uno a uno
    separate = data.split(" ") #separar
    if int(separate[0]) < int(separate[1]) and int(separate[0]) < int(separate[2]): #comparar buscando el menor
        add_data = int(separate[0])
    elif(int(separate[1]) < int(separate[0]) and int(separate[1]) < int(separate[2])):
        add_data = int(separate[1])
    else:
        add_data = int(separate[2])

    chain += f"{add_data} " #concatenar
    
print(chain)