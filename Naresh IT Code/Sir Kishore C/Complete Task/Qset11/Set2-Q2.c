#include<stdio.h>

void printEvenNumber(int number){
    if(number<=0){
        printf("invalid input\n");       
    }
    else{
        printf("The even number from 1 to %d:\n",number);
        for (int i = 2; i<=number; i++)
        {
            if(i%2==0){
                printf("%-4d",i);
            }
        }
        printf("\n");
    }
}
int main(){
    int number;

    printf("Enter your Number : ");
    scanf("%d",&number);
    printEvenNumber(number);
}