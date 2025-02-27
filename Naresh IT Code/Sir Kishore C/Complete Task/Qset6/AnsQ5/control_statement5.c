#include<stdio.h>

int main(){
    int num1,num2;
    printf("Enter two Number : ");
    scanf("%d%d",&num1,&num2);
    if(num1==num2){
        printf("Both are equals\n");
    }
    if(num2!=num1){
        printf("Both are not equals\n");
    }
}