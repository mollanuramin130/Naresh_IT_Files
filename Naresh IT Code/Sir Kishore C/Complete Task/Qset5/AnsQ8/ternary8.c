#include<stdio.h>

int main(){
    float amount,rate,time;
    printf("Enter the principal amount: ");
    scanf("%f",&amount);
    printf("\nEnter the rate of interest (in percentage): ");
    scanf("%f",&rate);
    printf("\nEnter the time period (in years): ");
    scanf("%f",&time);

    float simple_int= (amount*time*rate)/100;

    printf("The simple interest for the given principal amount %.2f,rate %.2f %%,\ntime %.2f years is %.2f.\n",amount,rate,time,simple_int);
}