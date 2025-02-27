#include<stdio.h>

void pattern18(int row, int cols){
    for(int i=1;i<=row;i++){
        for(int j=1;j<=cols;j++){
            if(i==j || (i+j)==row+1){
                printf(" #");
            }
            else{
                printf(" 0");
            }
        }
        printf("\n");
    }
}

int main(){
    int row,cols;
    printf("Enter your row and column : ");
    scanf("%d%d",&row,&cols);
    pattern18(row,cols);
}