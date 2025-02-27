#include<stdio.h>

int main(){
    int number;
    printf("Enter your 2 digit number\n");
    scanf("%d",&number);
    int value=number/10+1;
    printf("Next multiple of 10 be : %d\n",value*10);
}