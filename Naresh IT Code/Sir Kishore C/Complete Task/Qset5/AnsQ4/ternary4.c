#include<stdio.h>

int main(){
    float amount;
    printf("Enter your purchase amount in Rs : \n");
    scanf("%f",&amount);
    (amount>5000)?printf("Total amount = %.0f\n",(amount*(90.0/100))):(amount>=1000 && amount<=5000)?printf("Total amount = %.0f\n",amount*(95.0/100)):printf("Total amount = %.0f\n",amount);
    return 0;
}