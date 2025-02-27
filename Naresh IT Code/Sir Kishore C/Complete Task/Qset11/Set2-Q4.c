#include<stdio.h>

void printTable(int number);

void printTable(int number){
    if (number<=0)
    {
        printf("Invalid Input\n");
    }
    else{
        for (int i = 1; i <=10; i++)
        {
            printf("%d x %d = %d\n",number,i,number*i);
        }
    }  
}
int main(){
    int number;
    printf("enter your number : ");
    scanf("%d",&number);
    printTable(number);
}