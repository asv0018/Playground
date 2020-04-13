x=int(input())
y=int(x/(x**(1/2)))
if(y%(x**(1/2))==0):
  xx=y/(x**(1/2))
  y=y+xx
print(x+y)