#include<stdio.h>

void printNumber(int number){
    if(number<=0){
        printf("invalid input\n");       
    }
    else{
        printf("The number from 1 to %d:\n",number);
        for (int i = 1; i <=number; i++)
        {
            printf("%-4d",i);
        }
        
    }
}
int main(){
    int number;

    printf("Enter your Number : ");
    scanf("%d",&number);
    printNumber(number);
}