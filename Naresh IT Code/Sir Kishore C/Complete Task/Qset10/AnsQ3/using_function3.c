#include<stdio.h>
long reversNumber(int number){
    long revers=0;
    if(number>=0 || number<0){
        while (number!=0)
        {
            int rem=number%10;
            revers=revers*10+rem;
            number /=10;
        }
        return revers;        
    }
}
int main(){
    long number;
    printf("Enter your number : ");
    scanf("%ld",&number);
    printf("Revers Number is : %ld\n",reversNumber(number));

    return 0;
}