#include<stdio.h>
int bin(int* a,int l,int h,int k){
  int m=(l+h)/2;
  if(a[m]==k)
    return a[m];
  else if(a[m]>k)
    bin(a,l,m-1,k);
  else if(a[m]<k)
    bin(a,m+1,h,k);
}

int main(){
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
  for(int i=0;i<n;i++){
    for(int j=i;j<n;j++){
      if(a[i]>a[j]){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
      }
    }
  }
  int s;
  scanf("%d",&s);
printf("%d",bin(a,0,n,s));
}