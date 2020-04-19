#include<stdio.h>
union emp{
  int sal;
  char name[20];
};
int main(){
  union emp e;
  scanf("%s%d",&e.name,&e.sal);
  printf("Enter the Employee details\nEnter the Employee name\nEnter the Employee salary");
  printf("\n\nEmployee Details\n");
  printf("%s  %d\n",e.name,e.sal);
}