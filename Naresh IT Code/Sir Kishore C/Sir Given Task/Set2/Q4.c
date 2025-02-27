/*
input : 12345678
Output : 78 56 34 12
*/

#include<stdio.h>

int main(){
    int number;
    printf("Enter your number : ");
    scanf("%d",&number);
    if(number<0){
        number=-number;
        printf("- ");
    }
    int rem1=number%10;
    number/=10;
    
    while (number!=0)
    {
        int rem2=number%10;
        printf("%d%d ",rem2,rem1);
        number/=10;
        rem1=number%10;
        number /=10;
    }
    printf("\n");
}