#include<stdio.h>

void pattern17(int row, int cols){
    for(int i=1;i<=row;i++){
        for(int j=1;j<=cols;j++){
            if(i+j<=row){
                printf(" 0");
            }
            else{
                printf(" 1");
            }
        }
        printf("\n");
    }
}

int main(){
    int row,cols;
    printf("Enter your row and column : ");
    scanf("%d%d",&row,&cols);
    pattern17(row,cols);
}