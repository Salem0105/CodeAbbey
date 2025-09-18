#https://www.codeabbey.com/index/task_view/sum-in-loop

# Recibir los datos
first_number = int(input())
chain_number = input()
# Separar la cadena
numbers = chain_number.split(" ")
# Se incia en 0 la variable
sum = 0 

for i in range(first_number):
    #Se suma despues de convertir a entero
    sum += int(numbers[i])

print(sum)