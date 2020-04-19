#include<stdio.h>
int main()
{
int cc,c,a=0,b=1;
  scanf("%d",&c);
while(1){
    if(a<=c){
      if(a==c){
        printf("Fibonacci Number");
        break;
      }
      cc=a+b;
      a=b;
      b=cc;
   
    }
    if(a>c){
      printf("Not Fibonacci Number");
      break;
    }
  }
}