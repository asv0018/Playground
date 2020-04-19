#include<stdio.h>
int main(){
  char s[50];
  gets(s);
  int t=0;
  char freq[256]={0};
  for(int i=0;s[i]!='\0';i++){
    freq[s[i]]++;
  }
  for(int i=0;s[i]!='\0';i++){
    if(freq[s[i]]==1){
      printf("%c",s[i]);
      t++;
      break;
    }
  }
  if(t!=1)
    printf("All characters are repetitive\n");
}