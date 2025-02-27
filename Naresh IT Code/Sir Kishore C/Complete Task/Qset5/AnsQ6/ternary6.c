#include<stdio.h>

int main(){
    char type;
    float salary;
    printf("Enter Employee Type : ");
    scanf("%c",&type);
    printf("Enter Employee Salary : ");
    scanf("%f",&salary);

    type=='M'?(printf("Basic Salary : %.0f\nTotal Salary : %.0f\n",salary,(110/100.0)*salary)):(printf("Basic Salary : %.0f\nTotal Salary : %.0f\n",salary,(105/100.0)*salary));
}

