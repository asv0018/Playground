#include<stdio.h>
int main()
{
  int a,b=0,i=0,c=0,j=0;
  while(1){
    scanf("%d",&a);
    if(a==(-1)){
      break;
    }
    if(a%2==0){
      b=a+b;
      i++;
    }
    if(a%2!=0){
      c=c+a;
      j++;
    }
}
  printf("%d\n",b);
  printf("%d\n",c);
  printf("%0.2f\n",(float)b/i);
  printf("%0.2f",(float)c/j);
}
  