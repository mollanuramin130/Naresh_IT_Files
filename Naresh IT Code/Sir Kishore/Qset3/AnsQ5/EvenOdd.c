#include<stdio.h>

int main(){
    int number;
    printf("Enter your number ");
    scanf("%d",&number);
    number%2==0 && printf("Your Number Even\n") || printf("Number is Odd\n");
}