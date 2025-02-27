#include<stdio.h>
long factor(int number);
int isStrong(long number){
    long sum=0;
    long temp=number;
    while (temp!=0)
    {
        int rem=temp%10;
        sum=sum+factor(rem);
        temp/=10;
    }
    if(sum==number){
        return 1;
    }
    else{
        return 0;
    }
}

long factor(int number){
    long fact=1;
    if(number==0){
        return 1;
    }
    else{
        while(number>1){
            fact=fact*number--;
        }
        return fact;
    }
}

int main(){
    long range_start,range_end;
    scanf("%ld%ld",&range_start,&range_end);
    for(long i=range_start;i<=range_end;i++){
        if(isStrong(i)){
            printf("%ld ",i);
        }
    }

    return 0;
}