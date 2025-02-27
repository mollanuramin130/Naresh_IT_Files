#include<stdio.h>

int main(){
    int amount;
    printf("Enter deposit Amount = ");
    scanf("%d",&amount);
    if(amount<=1000){
        printf("Interest rate is 2%%\n");
    }
    else if(amount>1000 && amount<=5000){
        printf("Interest rate is 3%%\n");
    }
    else if(amount>5000 && amount<=10000){
        printf("Interest rate is 4%%\n");
    }
    else{
        printf("Interest rate is 5%%\n");
    }

    return 0;
}