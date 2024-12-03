#include<stdio.h>

int main(){
    int number;
    printf("Enter your number : ");
    scanf("%d",&number);
    if( (number>0) &&!printf("positive\n") || (number<0) && !printf("negetive\n") || (number==0) ){
        printf("Zero\n");
    }
    return 0;
}