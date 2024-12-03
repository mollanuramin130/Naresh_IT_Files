#include<stdio.h>

int main(){
    int number;
    printf("Enter your number : \n");
    scanf("%d",&number);
    number%2==0&&printf("Number Even\n") || printf("Number Odd\n");
    return 0;
}