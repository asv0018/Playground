#include<stdio.h>
void sort(int, int *); 

int main()
{
  int s;
  scanf("%d",&s);
  int aa[s];
  for(int i=0;i<s;i++){
    scanf("%d",&aa[i]);
  }
  sort(s,aa);
}

void sort(int a,int* b){
  for(int j=0;j<a-1;j++)
  {for(int i=0;i<a-j-1;i++){
   if(b[i]>b[i+1]){
     int iii=0;
     iii=b[i];
     b[i]= b[i+1];
     b[i+1]=iii;
   }
  }}
  printf("Sorted array is:\n");
  for (int i=0;i<a;i++){
    printf("%d\n",b[i]);
  }
}