#include<stdio.h>

int main(){
    int number1,number2;
    char opera;
    scanf("%d%d %c",&number1,&number2,&opera);
    switch (opera)
    {
    case '+':
        printf("Addition is: %d",number1+number2);
        break;
     case '-':
        printf("Subtraction is: %d",number1-number2);
        break;
     case '*':
        printf("Multiplication is: %d",number1*number2);
        break;
     case '/':
        printf("Divition is: %.2f",1.0*number1/number2);
        break;
    }
    return 0;
}