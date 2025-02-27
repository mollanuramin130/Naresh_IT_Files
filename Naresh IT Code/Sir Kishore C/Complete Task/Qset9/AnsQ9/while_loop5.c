#include<stdio.h>

int main(){
    int number,sum=0,number_copy;

    printf("Enter a number : ");
    scanf("%d",&number);
    number_copy=number;
    while(number>0){
        sum+=number--;
    }
    printf("Sum of natural number 1 to %d is : %d\n",number_copy,sum);
    return 0;
}