#include<stdio.h>
#include<math.h>

int armstrong(long number){
    int no_of_digit=0;
    long copy_number=number,copy_number2=number,sum=0;
    if(number<=0){
        return 0;
    }
    else{
        while (copy_number!=0)
        {
            no_of_digit++;
            copy_number/=10;
        }
        while (copy_number2!=0)
        {
            int rem=copy_number2%10;
            sum=sum + pow(rem,no_of_digit);
            copy_number2/=10;
        }
        if(number==sum){
            return 1;
        }
    }
    return 0;
}

int main(){
    long number;
    printf("Enter your Number : ");
    scanf("%ld",&number);
    if (armstrong(number))
    {
        printf("%ld is Armstrong numbers\n",number);
    }
    else{
        printf("%ld is not Armstrong numbers\n",number);
    }
    
}