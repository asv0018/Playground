#include<stdio.h>
int main()
{
  int s;
  int c=0;

  scanf("%d",&s);
  int ss=s;
  while(1){
    int a=s%10;
    s=s/10;
    if(s){
      a*=10;
      c*=10;
    }else{
      c+=a;
      break;
    }  
    c+=a;
  }
  if(ss==c){
    printf("Same");
  }
  else{
    printf("Not Same");
  } 
}