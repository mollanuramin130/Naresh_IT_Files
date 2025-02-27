#include<stdio.h>
void printSquares(int num);

int main(){
    int number;
    printf("Enter your Number : ");
    scanf("%d",&number);
    printSquares(number);
}

void printSquares(int num){
    if(num<=0){
        printf("Invalid Input\n");
    }
    else{
        printf("Number   Square\n");
        for(int i=1;i<=num;i++){
            printf("%d%12d\n",i,i*i);
        }
    }
}
