#include<stdio.h>

void pattern11(int row ,int col){
    char ch='A';
    for(int i=1;i<=row;i++){
        for(int j=1;j<=col;j++){
            printf("%3c",(ch+i-1+j-1));
        }
        printf("\n");
    }
}

int main(){
    int row ,col;
    printf("Enter your Row and Column Numbers : ");
    scanf("%d%d",&row,&col);
    pattern11(row,col);
}