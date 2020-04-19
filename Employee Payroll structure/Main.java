#include<stdio.h>
struct payroll{
  int id;
  char name[20];
  int salary,hra,da,med,pf,ins;
};
  
int main(){
  int n;
  printf("Enter the number of employees:\nEnter your input for every employee:\n");
  scanf("%d",&n);
  struct payroll s[n];
  for(int i=0;i<n;i++){
    scanf("%d%s%d%d%d%d%d%d",&s[i].id,&s[i].name,&s[i].salary,&s[i].hra,&s[i].da,&s[i].med,&s[i].pf,&s[i].ins);
    printf("Employee ID:\nEmployee Name:\nBasic salary,HRA:\nDA,Medical Allowance:\nPF and Insurance:");
  }
  printf("Enter employee ID to get payslip:\n");
  int f;
  scanf("%d",&f);
  for(int i=0;i<n;i++){
    if(s[i].id==f){
      f=i;
    }
  }
  printf("Salary slip of %s:\n",s[f].name);
  printf("Employee ID:%d\nBasic Salary:%d\nHouse Rent Allowance:%d\nDearness Allowance:%d\nMedical Allowance:%d\n",s[f].id,s[f].salary,s[f].hra,s[f].da,s[f].med);
  float gs=(s[f].salary+s[f].hra+s[f].da+s[f].med)*12;
  printf("Gross Salary:%0.2f Rupees\n",gs);
  printf("Deductions:\n");
  float ns=gs-((s[f].pf+s[f].ins)*12);
  printf("Provident fund:%d\nInsurance:%d\nNet Salary:%0.2f Rupees\n",s[f].pf,s[f].ins,ns);
}