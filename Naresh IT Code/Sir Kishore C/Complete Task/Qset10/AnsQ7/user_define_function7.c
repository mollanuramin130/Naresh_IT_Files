#include<stdio.h>

long factorial(int num){
    long factValue=1;
    if(num==0){
        return 1;
    }
    else{
        do
        {
            factValue=factValue*num;
            num--;
        } while (num!=0);
    return factValue;
    }
}
int main(){
    int num;
    printf("Enter the positive integer: ");
    scanf("%d",&num);
    if (num<0)
    {
        printf("Invalid input...Please enter a positive\n");
    }
    else{
        printf("Factorial of %d = %ld\n",num,factorial(num));
    }
    
    return 0;
}