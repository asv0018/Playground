#include<stdio.h>
int main()
{
 int e;
 printf("Enter n value\n");
 scanf("%d",&e);
 for(int i=0;i<e;i++){
   printf("%d ",(i)*(i+1));
 }
}