#include<stdio.h>

int findMax(long number){
    if(number<0){
        number=-number;
    }
    int max=0;
    while (number!=0)
    {
        int rem=number%10;
        if(rem>max){
            max=rem;
        }
        number/=10;
    }
    return max;
}

int main(){
    long number;
    printf("Enter your number : ");
    scanf("%ld",&number);
    printf("%d is highest digit in the number.\n",findMax(number));

}