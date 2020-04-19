lis=[0]
x=int(input())
for i in range(3,(x*2)+1):
  if (i%2)!=0:
    lis.append(lis[len(lis)-1]+i)
print("Enter n value")
st=""
for i in lis:
  st=st+str(i)+" "
print(st)