#include<stdio.h>
int main(){
  int s;
  scanf("%d",&s);
  int x=s;
  int xx=0;
  while(1){
    if(x%10!=0){
    int y=x/10;
    int z=x%10;
    xx=xx+z;
    x=y;
    }else{break;}
  }
  if(s%xx==0){
  printf("Harshard Number");
  }
  else{
    printf("Not Harshard Number");
  }
    
}

    