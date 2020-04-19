#include<stdio.h>
int main()
{ int a,b,c,d;
  scanf("%d%d%d%d",&a,&b,&c,&d);
 a=a+c;
 b=b+d;
 a=a+(b/100);
 printf("%d\n",a);
 printf("%d",b%100);
}