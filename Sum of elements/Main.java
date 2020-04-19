#include<stdio.h>
int main()
{
  int c;
  scanf("%d",&c);
  int cc=0;
  int a[c];
  for(int i=0;i<c;i++){
    scanf("%d",&a[i]);
    cc=cc+a[i];
}
  printf("%d",cc);
}