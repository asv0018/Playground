#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int j=0;
  int a[n];
  for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
    if(j<a[i])
      j=a[i];
}
 printf("%d",j);
}