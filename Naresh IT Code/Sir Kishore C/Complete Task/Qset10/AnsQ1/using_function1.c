#include<stdio.h>

int countDigit(int number);

int main(){
    int number;
    printf("Enter your number : ");
    scanf("%d",&number);
    printf("%d\n",countDigit(number));
    return 0;
}

int countDigit(int number){
    int count=0;
    if(number==0){
        return 1;
    }else{
        while (number!=0)
        {
            count++;
            number/=10;
        }
        
    }
    return count;
}