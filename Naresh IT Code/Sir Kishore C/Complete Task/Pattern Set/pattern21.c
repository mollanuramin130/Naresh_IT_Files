#include<stdio.h>

void pattern21(int row, int cols){
    for(int i=1;i<=row;i++){
        for(int j=1;j<=cols;j++){
           if(i==1 || i==row || j==1 || j==cols || i==j || i+j==row+1){
            printf(" *");
           }
           else{
            printf("  ");
           }
        }
        printf("\n");
    }
}

int main(){
    int row,cols;
    printf("Enter your row and column : ");
    scanf("%d%d",&row,&cols);
    pattern21(row,cols);
}