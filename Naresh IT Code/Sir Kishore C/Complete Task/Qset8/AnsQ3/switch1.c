#include<stdio.h>

int main(){
    int number;
    printf("Enter number : ");
    scanf("%d",&number);
    switch(number%2){
        case 0: printf("Even\n");
        break;
        case 1: printf("Odd\n");
        break;
    }
    return 0;
}