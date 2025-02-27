#include<stdio.h>

int calculateSum(int number){
    int sum=0;
    if(number<=0){
       return 0;      
    }
    else{
        for (int i = 1; i<=number; i++)
        {
           sum+=i;
        }
        return sum;
    }
}
int main(){
    int number;
    printf("Enter your Number : ");
    scanf("%d",&number);
    if(calculateSum(number)){
        printf("The sum of the numbers from 1 to %d: %d\n",number,calculateSum(number));
    }
    else{
        printf("Invalid input\n");
    }
}