#include<stdio.h>
void oddEvenSum(int number);

int main(){
    int number;
    printf("Enter your Number : ");
    scanf("%d",&number);
    oddEvenSum(number);
    return 0;
}

void oddEvenSum(int number){
    int oddSum=0,evenSum=0,count=1;
    if (number<0){
        printf("Invalid Input\n");
    }
    else{
        while (count<=number)
        {
            if (count%2==0)
            {
                evenSum+=count;
            }
            else{
                oddSum+=count;
            }
            count++;
        }
        printf("Even sum = %d and Odd sum = %d\n",evenSum,oddSum);
    }    
}