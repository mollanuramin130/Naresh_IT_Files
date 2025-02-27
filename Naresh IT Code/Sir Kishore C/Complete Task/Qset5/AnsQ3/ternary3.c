#include<stdio.h>

int main(){
    int number1,number2,number3;
    printf("Enter Three numbers : \n");
    scanf("%d%d%d",&number1,&number2,&number3);
    (number1>=number2)? ((number1>=number3)?printf("Max = %d",number1):printf("Max = %d",number3)):((number2>=number3)?printf("Max = %d",number2):printf("Enter valid number"));
    return 0;
}