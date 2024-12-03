#include<stdio.h>

int main(){
    int number;
    printf("Enter your number: \n");
    scanf("%d",&number);
    int mod=number%10;
    number=number -mod;
    printf("%d\n",(number+(mod>=5)*10));
}