#include<stdio.h>

int main(){
    int number=657765;
    int sum=0;
    int firstCheck=0;
    while(number>0){
        int mod=number%10;
        if(firstCheck==0){
            sum=sum+mod;
            firstCheck++;
        }
        if(number<10){
            sum=sum+mod;
        }
        number=number/10;
    }
    printf("Sum=%d\n",sum);
}