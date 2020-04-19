data=[]
d=input()
data.append(d)
mem=d[len(d)-1]
while True:
  d=input()
  if d=="####":
    break
  if mem==d[0]:
  	data.append(d)
  	mem=d[len(d)-1]
for i in data:print(i) 