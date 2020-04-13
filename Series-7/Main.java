#include<stdio.h>
int main()
{
  int a=10;
  int b=5;
  int x;
  printf("Enter n value\n");
  scanf("%d",&x);
  printf("%d %d ",a,b);
  for(int i=1;i<=(x-2);i++){
    if(i%2==0){
      b=b+10;
      printf("%d ",b);
    }
    if(i%2!=0){
      a=a+50;
      printf("%d ",a);
    }
}
}