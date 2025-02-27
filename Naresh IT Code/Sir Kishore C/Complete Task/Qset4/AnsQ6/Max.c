#include<stdio.h>

int main(){
    int num1,num2,num3;
    printf("Enter Three numbers: \n");
    scanf("%d%d%d",&num1,&num2,&num3);
    (num1>=num2 && num1>=num3)&& printf("Max = %d\n",num1) || (num2>=num1 && num2>=num3)&& printf("Max = %d\n",num2) ||(num3>=num2 && num3>=num2)&& printf("Max = %d\n",num3);
}