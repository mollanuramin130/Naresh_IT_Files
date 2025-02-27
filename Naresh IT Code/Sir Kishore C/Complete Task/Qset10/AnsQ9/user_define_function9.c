#include<stdio.h>
int isPrime(int num){
    int i=2;
    if(num<0) num=-num;
    while(i<num){
        if(num%i==0){
            return 0;
        }
        i++;
    }
    return 1;
}

int main(){
    int num;
    printf("Enter an integer: ");
    scanf("%d",&num);
    if(isPrime(num)){
        printf("%d is prime number.\n",num);
    }
    else{
        printf("%d is not prime number.\n",num);
    }
    return 0;
}