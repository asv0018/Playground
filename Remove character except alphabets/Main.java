data=input()
word=""
for ch in data:
  if((ch >= 'a' and ch <= 'z') or (ch >= 'A' and ch <= 'Z')):
    word+=ch
print(word)
