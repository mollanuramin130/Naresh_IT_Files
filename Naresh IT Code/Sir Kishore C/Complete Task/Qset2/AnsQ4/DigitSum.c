#include<stdio.h>

int main(){
    int number=23;
    int sum=0;
    while(number>0){
        int mod=number%10;
        sum=sum+mod;
        number=number/10;
    }
    printf("Sum=%d\n",sum);
}