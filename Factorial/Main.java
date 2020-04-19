#include<stdio.h>
int main()
{
  int n;
  int p=1;
  scanf("%d",&n);
  while(n>0){
    p=p*(n--);
}
  printf("%d",p);
}