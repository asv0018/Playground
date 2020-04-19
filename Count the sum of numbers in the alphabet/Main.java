data=input()
temp=""
data+=" "
sum=0
for i in data:
  if i.isdigit():
    temp+=i
  else:
    sum+=int(temp)
    temp="0"
print(sum)