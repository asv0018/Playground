#include<stdio.h>
int main()
{
  int n,m;
  int nn=0,mm=0;
  scanf("%d%d",&n,&m);
  for(int i=1;i<=(n/2);i++){
    if(n%i==0){
      nn=nn+i;
    }
  }
  for(int i=1;i<=(m/2);i++){
    if(m%i==0){
      mm=mm+i;
    }
  }
  if((nn/n)==(mm/m)){
  
    printf("Friendly Pair");
  }else{
    printf("Not Friendly Pair");
  }
      
}