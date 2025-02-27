#include<stdio.h>

int main(){
    int number;
    printf("Enter your number : ");
    scanf("%d",&number);
    if(number%2==0){
        printf("%d is Even\n",number);
    }
    if(number%2==1){
        printf("%d is Odd\n",number);
    }
}