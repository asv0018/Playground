#include<stdio.h>
int main()
{
  int r;
  scanf("%d",&r);
  int y=101,ii=0;
  int o=0;
  int io=0;
 while(io<r){
   for(int i=2;i<y;i++){
     if(y%i==0){
       o=1;
       break;
     }
   }
   if(o==0){
     printf("%d ",y);
     io++;
   }
   y++;o=0;
 }
}