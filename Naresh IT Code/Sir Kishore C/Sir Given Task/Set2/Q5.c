#include<stdio.h>

int main(){
    long number,rev=0;
    printf("Enter your number : ");
    scanf("%ld",&number);
    do
    {
        rev=rev*10 + (number%10);
        number/=10;
    } while (number!=0);
    do
    {
        switch (rev%10)
        {
        case 0:
            printf("Zero ");
            break;
        case 1:
            printf("One ");
            break;
        case 2:
            printf("Two ");
            break;
        case 3:
            printf("Three ");
            break;
        case 4:
            printf("Four ");
            break;
        case 5:
            printf("Five ");
            break;
        case 6:
            printf("Six ");
            break;
        case 7:
            printf("Seven ");
            break;
        case 8:
            printf("Eight ");
            break;
        case 9:
            printf("Nine ");
            break;
        }
        rev/=10;
    } while (rev!=0);
    printf("\n");
}