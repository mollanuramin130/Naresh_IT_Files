#include<stdio.h>

int main(){
    int number;
    printf("Enter your number : \n");
    scanf("%d",&number);
    (number>0)?printf("Number is positive \n"):(number<0)?printf("Number is negative .\n"):printf("Number is Zero.\n");
    return 0;
}