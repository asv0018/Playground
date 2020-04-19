#include<stdio.h> 
int main()
{
  int a[4],b[4];
  int sb;
  int sa=sb=0;
  int saa=0;
  int sbb=0;
  for(int i=0;i<4;i++){
    scanf("%d",&a[i]);
    saa+=a[i];
    sa++; 
  }
  for(int i=0;i<4;i++){
    scanf("%d",&b[i]);
    sbb+=b[i];
    sb++;
  }
 if((saa==sbb)&&(sa==sb)){
printf("Same");
 }else{
   printf("Not Same");
 }
}
  
