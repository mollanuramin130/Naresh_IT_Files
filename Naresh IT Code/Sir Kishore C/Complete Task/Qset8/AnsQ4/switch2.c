#include<stdio.h>

int main(){
    int number1,number2;
    printf("Enter two numbers: ");
    scanf("%d%d",&number1,&number2);
    switch(number1>=number2){
        case 0:printf("Max = %d\n",number2);
        break;
        case 1: printf("Max = %d\n",number1);
    }
    return 0;
}