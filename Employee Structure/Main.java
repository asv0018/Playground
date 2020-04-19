#include<stdio.h>
struct employee{
  char name[20];
  int id;
  int age;
  char designation[20];
  long salary;
}e;
int main(){
  printf("Enter name:\nEnter ID:\nEnter age:\nEnter designation:\nEnter Salary:\nEmployee Details\n");
  scanf("%s%d%d%s%ld",&e.name,&e.id,&e.age,&e.designation,&e.salary);
  printf("Name of the Employee:%s\n",e.name);
  printf("ID of the Employee:%d\n",e.id);
  printf("Age of the Employee:%d\n",e.age);
  printf("Designation of the employee:%s\n",e.designation);
  printf("Salary of the Employee:%ld\n",e.salary);
}