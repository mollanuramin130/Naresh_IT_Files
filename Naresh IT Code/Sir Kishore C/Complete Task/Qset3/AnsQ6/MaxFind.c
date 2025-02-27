#include<stdio.h>

int main(){
    int number1,number2;
    printf("Enter two numbers :\n");
    scanf("%d%d",&number1,&number2);
    number1>number2 && printf("MAX = %d\n",number1) || printf("MAX = %d\n",number2);
}