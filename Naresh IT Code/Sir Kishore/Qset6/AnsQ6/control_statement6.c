#include<stdio.h>

int main(){
    int age;
    char name[20];

    printf("Enter your name: ");
    scanf("%s",name);
    printf("Enter your age: ");
    scanf("%d",&age);

    if(age>=18){
    printf("Hi %s you are eligible to vote.\n",name);
    }
    if(age<18){
        printf("Sorry %s you are not eligible to vote.\n",name);
    }
}