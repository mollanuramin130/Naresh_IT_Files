#include<stdio.h>

int main(){
    int number;
    printf("Enter your number : ");
    scanf("%d",&number);
    int sum=number*(number+1)/2;
    printf("sum of %d natural numbers be : %d\n",number,sum);
}