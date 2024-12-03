#include<stdio.h>

int main(){
    int age;
    printf("Enter your age: ");
    scanf("%d",&age);
    if(age>=21){
        printf("you are eligible to marriage.\n");
    }
    else{
        printf("Sorry  are not eligible to marriage.\n");
    }
}