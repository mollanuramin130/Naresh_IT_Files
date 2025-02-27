#include<stdio.h>

int main(){
    int first,last,number,flag=1;
    printf("Enter your number : ");
    scanf("%d",&number);
    while(number!=0){
        if(flag){
            last=number%10;
            flag=0;
        }
        
        if(number<=9 && number>=-9){
            first=number;
        }
        number /=10;
    }
    if(first<0){
        printf("First Digit : %d and Last Digit : %d\n",-first,-last);
    }else{
        printf("First Digit : %d and Last Digit : %d\n",first,last);
    }
    
    return 0;
}