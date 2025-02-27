#include<stdio.h>

int main(){
    int count=0,position=1,number,reverse_number=0,flag=0;
    printf("Enter your number : ");
    scanf("%d",&number);
    while(number!=0){
        int rem=number%10;
        if(rem==0){
            flag=1;
        }
        reverse_number=reverse_number*10 + rem;
        count++;
        number/=10;
    }
    if(flag){
        while(reverse_number!=0){
        int rem=reverse_number%10;
        
        if(rem==0){
            break;
        }
        position++;
        reverse_number/=10;
    }
    printf("First 0th position : %d\n",position);
    }
    else{
        printf("Zero not Exist in the given number...\n");
    }
    
    return 0;
}