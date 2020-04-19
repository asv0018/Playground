x=int(input())
ini=7
secini=5
st=""
for i in range(x):
  if((i+1)%2==0):
    st=st+str(secini)+" "
    secini=secini+1
  if((i+1)%2!=0):
    
    st=st+str(ini)+" "
    ini=ini+1
    
print(st)