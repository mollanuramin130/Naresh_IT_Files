#include<stdio.h>

int main (){
    int number =287;
    int first,last;
    int lastCheck=0;
    while (number>0)
    {
        int mod=number%10;
        if(lastCheck==0){
            last=mod;
            lastCheck++;
        }
        if(number<10){
            first=number;
        }
        number=number/10;
    }
    printf("sum of first and last digit is : %d\n",first+last);
    return 0;
}