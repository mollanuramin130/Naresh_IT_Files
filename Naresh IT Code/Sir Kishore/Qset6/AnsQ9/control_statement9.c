#include<stdio.h>

int main(){
    int num1,num2,num3;
    printf("Enter three subject marks : ");
    scanf("%d%d%d",&num1,&num2,&num3);
    if( !((num1<=35 || num2<=35 || num3<=35) && printf("Result is Fail\n")) ){
        printf("Result is pass\n");
    }

    return 0;
}