#include<stdio.h>
int main()
{
int z;
  printf("Enter n value\n");
  scanf("%d",&z);
  for(double i=1;i<=z;i++){
    printf("%0.0lf ",pow(i,i));
  }
}