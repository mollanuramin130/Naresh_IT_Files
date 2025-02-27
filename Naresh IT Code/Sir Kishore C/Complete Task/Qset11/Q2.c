#include<stdio.h>

int isSpy(int number){
    int sum=0,product=1;
    if(number<0){
        return 0;
    }
    else{
        while (number!=0)
        {
            int rem =number%10;
            sum+=rem;
            product*=rem;
            number/=10;
        }
        if(sum==product){
            return 1;
        }
    }
    return 0;
}

int main(){
    int number;
    printf("Enter your Number : ");
    scanf("%d",&number);
    if(isSpy(number)){
        printf("Is spy number\n");
    }
    else{
        printf("Is not spy number\n");
    }

}