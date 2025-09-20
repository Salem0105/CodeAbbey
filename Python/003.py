#https://www.codeabbey.com/index/task_view/sums-in-loop

r = int(input())
chain = ""

for i in range(r):
    vs = input() 
    svs = vs.split(" ")
    sumvs = int(svs[0]) + int(svs[1])
    chain += f"{sumvs} "
    
print(chain)
    