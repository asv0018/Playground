#include<stdio.h>
int main()
{
  int a;
  int n=0;
  scanf("%d",&a);
  for (int i=1;i<=(a/2);i++){
    if(a%i==0){
      n=n+i;
    }
  }
  if(n>a){
    printf("Abundant Number");
  }
  else{
    printf("Not Abundant Number");
  }
}