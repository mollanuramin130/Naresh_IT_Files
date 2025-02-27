#include<stdio.h>

int main(){
    int number,fact=1;
    printf("Enter the Number : ");
    scanf("%d",&number);
    int temp=number;
    if(number<0){
        printf("Invalid input Please enter a positive integer.");
    }
    else if(number==0){
        printf("Factorial of 0 = 1");
    }
    else{
        while (number!=0)
        {
            
            fact*=number--;
            
        }
        printf("Factorial of %d = %d",temp,fact);
        
    }
    return 0;
}