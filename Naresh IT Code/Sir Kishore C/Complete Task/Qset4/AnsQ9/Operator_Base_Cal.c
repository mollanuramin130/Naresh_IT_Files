#include<stdio.h>

int main(){
    printf("Enter a operator (+,-,*,/) : ");
    char operator;
    scanf("%c",&operator);
    printf("Enter first number : ");
    float number1;
    scanf("%f",&number1);

    printf("Enter first number : ");
    float number2;
    scanf("%f",&number2);
    switch (operator)
    {
    case '+':
        printf("Addition is : %.2f \n",number1+number2);
        break;
    case '-':
        printf("Subtraction is : %.2f \n",number1-number2);
        break;
    case '*':
        printf("Multiplication is : %.2f \n",number1*number2);
        break;
    case '/':
        printf("Divition is : %.2f \n",number1/number2);
        break;
    default:
        printf("Enter valid operator !...\n");
        break;
    }
}