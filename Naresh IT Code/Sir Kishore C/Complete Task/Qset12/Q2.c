#include<stdio.h>

void primeNumber(int num1, int num2){
    int flag;
    if(num1<=0 || num2<=0 || num1>=num2){
        printf("Invalid Input\n");
    }
    else{
        printf("%d to %d prime numbers : \n",num1,num2);
        if (num1==1)num1=num1+1;
        
        for(int i=num1;i<=num2;i++){
            for(int j=2;j<=i/2;j++){
                flag=1;
                if(i%j==0){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                printf("%4d",i);
            }
        }
        printf("\n");
    }
}

int main(){
    int range_start,range_end;
    printf("Enter start number : ");
    scanf("%d",&range_start);
    printf("Enter end Number : ");
    scanf("%d",&range_end);
    primeNumber(range_start,range_end);
}