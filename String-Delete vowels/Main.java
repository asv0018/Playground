inp=input()
vovel=['a','e','i','o','u']
temp=""
for i in inp:
  if i in vovel:
    continue
  temp+=i
print(temp)