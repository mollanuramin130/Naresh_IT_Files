#include<stdio.h>

int sumOfDigit(){
    int number,sum=0;
    printf("Enter the number : ");
    scanf("%d",&number);
    if (number>=0)
    {
        while (number!=0)
        {
            int rem=number%10;
            sum +=rem;
            number /=10;
        }
        return sum;
    }
    else if (number<0)
    {
        number=-number;
         while (number!=0)
        {
            int rem=number%10;
            sum +=rem;
            number /=10;
        }
        return sum;
    }
    else{
        printf("Enter valid Number....\n");
    }
}

int main(){

    printf("Sum Value : %d\n",sumOfDigit());
    return 0;
}
