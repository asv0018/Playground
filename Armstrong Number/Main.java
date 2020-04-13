#include<stdio.h>
int main()
{
  int n;
  int nn=0;
  scanf("%d",&n);
  int nnn=n;
  while(n!=0){
    int a=n%10;
    nn=nn+(a*a*a);
    n=n/10; 
}
  if(nn==nnn){
    printf("Armstrong Number");
  }else{
    printf("Not Armstrong Number");
  }
}