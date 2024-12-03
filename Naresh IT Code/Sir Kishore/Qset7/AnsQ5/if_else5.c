#include<stdio.h>

int main(){
    int number;
    printf("Enter your number : ");
    scanf("%d",&number);
    if(number>=100 && number<=999){
        printf("Previous multiple : %d\nnext multiple : %d\n",(number/100)*100,(number/100 +1)*100);
    }
    else{
        printf("Invalid Input\n");
    }
}