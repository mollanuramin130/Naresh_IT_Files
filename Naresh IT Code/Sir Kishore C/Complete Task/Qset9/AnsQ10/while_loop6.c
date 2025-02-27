#include<stdio.h>

int main(){
    int number;
    printf("Enter a number : ");
    scanf("%d",&number);
    while (number>0)
    {
        printf("%d\n",number%10);
        number=number/10;
    }
    
    return 0;
}