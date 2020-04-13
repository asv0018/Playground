x=int(input("Enter n value\n"))
op=""
lis=[0,1,2]
for i in range(x-2):
  lis.append(lis[len(lis)-1]+lis[len(lis)-2])
lis.remove(0)
for i in lis:
  op=op+str(i)+" "
print(op)