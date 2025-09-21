#https://www.codeabbey.com/index/task_view/min-of-two

#recibir primer dato
receive = int(input())
chain = ""

for i in range(receive):
    data = input() #recibir uno a uno
    separate = data.split(" ") #separar
    if int(separate[0]) < int(separate[1]): #comparar buscando el menor
        add_data = int(separate[0])
    else:
        add_data = int(separate[1])

    chain += f"{add_data} " #concatenar
    
print(chain)