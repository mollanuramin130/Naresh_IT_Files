#include<stdio.h>

int main(){
    int number,flag=1;
    scanf("%d",&number);
    if(number<=0){
        printf("Invalid input. Enter a positive integer.");
    }
    else{
        for(int i=2;i<=number/2;i++){
        if(number%i==0){
            flag=0;
        }
    }
    if(flag){
        printf("%d is a prime number.",number);
    }
    else{
        printf("%d is not a prime number.",number);
    }
    }
    return 0;
}