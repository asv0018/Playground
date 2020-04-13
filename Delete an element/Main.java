#include<stdio.h>
int main()
{
  int r;
  scanf("%d",&r);
  int a[r];
  for(int i=0;i<r;i++){
    scanf("%d",&a[i]);
  }
  int rr;
  scanf("%d",&rr);
  for(int i=rr;i<r;i++){
    a[rr-1]=a[rr];
  }
  r=r-1;
  printf("Array after deletion is:\n");
  for(int i=0;i<r;i++){
    printf("%d\n",a[i]);
  }
  
}