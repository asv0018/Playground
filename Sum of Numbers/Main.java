#include<stdio.h>
int main()
{
  int a,b=0;
    while(1){
    scanf("%d",&a);
    if(a==(-1)){
      break;
    }
      b=a+b;
  }
  printf("%d",b);
}