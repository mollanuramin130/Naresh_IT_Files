#include<stdio.h>

int main(){
    int number;
    printf("Enter your 2 digit number\n");
    scanf("%d",&number);
    int value=number/10;
    int mod=number%10;
    ((mod<5)&&printf("%d\n",value*10));  //if the (mod<5) its false then next part not execute by the compiler ie printf("%d\n",value*10)); not print anything.
    ((mod>=5)&&printf("%d\n",(value+1)*10));
}