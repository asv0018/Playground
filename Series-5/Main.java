#include<stdio.h>
int main()
{
  int e;
  scanf("%d",&e);
  int d=2;
  for(int i=0;i<e;i++){
    printf("%d ",d);
    d=((d+1)*2)-(i+2);
  }
}