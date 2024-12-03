#include<stdio.h>

int main(){
    int num1,num2;
    printf("Enter two Number : ");
    scanf("%d%d",&num1,&num2);
    if(num1>=num2){
        printf("Max is : %d\n",num1);
    }
    if(num2>num1){
        printf("Max is : %d\n",num2);
    }
}