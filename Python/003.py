#https://www.codeabbey.com/index/task_view/sums-in-loop

receive = int(input())
chain = ""

for i in range(receive):
    data = input() 
    separate = data.split(" ")
    add_data = int(separate[0]) + int(separate[1])
    chain += f"{add_data} "
    
print(chain)
    