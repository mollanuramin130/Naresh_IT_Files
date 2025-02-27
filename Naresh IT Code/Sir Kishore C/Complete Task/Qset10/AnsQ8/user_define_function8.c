#include<stdio.h>
int palindrome(long number){
    long copy_number=number;
    long reverse=0;
    if(number<0){
        return 0;
    }
    else{

    do
        {
            int rem=copy_number%10;
            reverse=reverse*10+rem;
            copy_number/=10;
        } while (copy_number!=0);
        if(reverse==number){
            return 1;
        }
        else{
            return 0;
        }
    } 
}

int main(){

    long number;
    printf("Enter an integer: ");
    scanf("%ld",&number);
    if(palindrome(number)){
        printf("%ld is palindrome number\n",number);
    }
    else{
        printf("%ld is not palindrome number\n",number);
    }
    return 0;
}