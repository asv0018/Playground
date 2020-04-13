#include<stdio.h>
int main()
{
  int n;
  int f=0;
  scanf("%d",&n);
  if(n==0||n==1){
     printf("Prime");
  }else{
  for(int i=2;i<(n/2);i++){
    if(n%i==0){
      printf("Not prime");
      f=1;
      break;
    }
  }
  
  if(f==0){
    printf("Prime");
  }
  }
}