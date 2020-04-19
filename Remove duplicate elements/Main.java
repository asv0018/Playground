#include<stdio.h>
int main()
{
  int w;
  scanf("%d",&w);
  int a[w];
  for(int i=0;i<w;i++){
    scanf("%d",&a[i]);
  }
  for(int i=0;i<w;i++){
     for(int j=i+1;j<w;j++){
       if(a[i]==a[j]){
         for(int k=j;k<w;k++){
           a[k]=a[k+1];
         }
         w--;j--;
       }
     }
  }
  for(int i=0;i<w;i++)
    printf("%d\n",a[i]);
}
