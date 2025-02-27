#include<stdio.h>

long factorial(int number){
    long fact=1;
    while (number>1)
    {
        fact*=number;
        number--;
    }
    return fact;
}
int isStrong(long number){
    long sum=0,copy_number=number;
    if (number<0)
    {
        return 0; 
    }
    else{
        while (number!=0)
        {
            int rem=number%10;
            sum=sum+factorial(rem);
            number/=10;
        }
        if (copy_number==sum)
        {
            return 1;
        }
       return 0; 
    }
    
}

int main(){
    long number;
    printf("Enter your number : ");
    scanf("%ld",&number);
    if(isStrong(number)){
        printf("%ld is strong number\n",number);
    }
    else{
        printf("%ld is not strong number\n",number);
    }
}