#include<stdio.h>

int main(){
    int min=9,max=0,number;
    printf("Enter your Number : ");
    scanf("%d",&number);
    if(number<0){
        number=-number;
    }
    if(number!=0){
         while(number!=0){
        int rem=number%10;
        if(rem<min){
            min=rem;
        }
        if(rem>max){
            max=rem;
        }
        number /=10;
        }
         printf("Max Digit : %d and Min Digit : %d\n",max,min);
    }
    else{
        printf("Enter Non Zero number....\n");
    }
    return 0;
}