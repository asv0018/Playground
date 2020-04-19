data=input()
v,c,w,d,s=0,0,0,0,0
vowels=['a','e','i','o','u']

for i in data:
  if i.isdigit():
    d+=1
  elif i==" ":
    w+=1
  elif i in vowels:
    v+=1
  elif i not in vowels:
    c+=1
  else:
    s+=1
print("Vowels:%d"%v)
print("Consonants:%d"%c)
print("White Spaces:%d"%w)
print("Digits:%d"%d)
print("Symbols:%d"%s)