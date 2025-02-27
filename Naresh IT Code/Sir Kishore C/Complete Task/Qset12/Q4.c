#include<stdio.h>
long factorial(int number);
int isStrong(long number);

void isStrongNumber(long num1,long num2){
    if(num1<=0 ||num2<=0 || num1>num2){
        printf("Invalid Input\n");
    }
    else{
        printf("Strong numbers between %ld and %ld are: \n",num1,num2);
        for(long i=num1;i<=num2;i++){
            if(isStrong(i)){
                printf("%ld ",i);
            }
        }
        printf("\n");
    }
}
int main(){
    long start,end;
    printf("Enter start number : ");
    scanf("%ld",&start);
    printf("Enter end number : ");
    scanf("%ld",&end);
    isStrongNumber(start,end);
}

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
        while (number!=0 )
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