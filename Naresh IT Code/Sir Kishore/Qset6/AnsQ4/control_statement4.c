#include<stdio.h>

int main(){
    int number;
    printf("Enter a number : ");
    scanf("%d",&number);
    if(number%10>=5){
        printf("Next multiple : %d\n",(number/10 +1)*10);
    }
    if(number%10<5){
        printf("Previous multiple : %d\n",(number/10 )*10);
    }
}