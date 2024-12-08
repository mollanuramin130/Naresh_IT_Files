#include<stdio.h>

int main(){
    float number1,number2;
    char operator;
    printf("Enter num1 :");
    scanf("%f",&number1);
    printf("Enter num2 :");
    scanf("%f",&number2);
    printf("enter operation : ");
    scanf(" %c",&operator);
    if(operator=='+' || operator=='-' || operator=='*' || operator=='/' || operator=='%' ){
        switch(operator){
        case '+':
        printf("Addition is :%.2f\n",(number1+number2));
        break;
        case '-':
        printf("Subtraction is :%.2f\n",(number1-number2));
        break;
        case '*':
        printf("Multiplication is :%.2f\n",(number1*number2));
        break;
        case '/':
        printf("Divition is :%.2f\n",(number1/number2));
        break;
        case '%':
        printf("Modulation is :%d\n",((int)(number1))%(int)(number2));
        break;
        
        }
    }
    else{
        printf("Enetr Valid operator....\n");
    }
    return 0;
}