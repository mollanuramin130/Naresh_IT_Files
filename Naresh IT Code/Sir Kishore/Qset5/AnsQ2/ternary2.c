#include<stdio.h>

int main(){
    int number;
    printf("Enter your number : \n");
    scanf("%d",&number);
    (number%2==0)?printf("Even Number \n"):printf("Odd Number \n");
    return 0;
}