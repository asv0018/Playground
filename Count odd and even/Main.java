#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  int o,e;o=e=0;
  for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
    if(a[i]%2==0)
      e++;
    else
      o++;
  }
  printf("Odd: %d\n",o);
  printf("Even: %d\n",e);
}