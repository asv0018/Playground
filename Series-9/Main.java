#include<stdio.h>
int main()
{ int r;
  printf("Enter n value");
  scanf("%d",&r);
 for(int i = 1;i<=r;i++){
   if(i%2==0){
   printf("%d ",i*i);
   }
   if(i%2!=0){
     printf("%d ",i*i*i);
   }
 }
}