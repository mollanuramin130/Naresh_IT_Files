#include<stdio.h>

void pattern1(){
    printf("Enter row and column no : ");
    int row,col;
    scanf("%d%d",&row,&col);
    for(int i=1;i<=row;i++){
        for(int j=1;j<=col;j++){
            printf("* ");
        }
        printf("\n");
    }
}

int main(){
    pattern1();
}