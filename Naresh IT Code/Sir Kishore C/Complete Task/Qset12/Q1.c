#include<stdio.h>

void printFibonacci(int range){
    int f1=0,f2=1,f3;
    if(range<=0){
        printf("Invalid Input\n");
    }else{
        for(int i=0;i<range;i++){
            printf("%4d",f1);
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
    printf("\n");
    }
}
int main(){
    int range;
    printf("Enter your number :");
    scanf("%d",&range);
    printFibonacci(range);
}