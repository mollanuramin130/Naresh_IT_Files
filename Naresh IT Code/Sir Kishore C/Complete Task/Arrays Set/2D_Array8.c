#include<stdio.h>

int main(){
    printf("Enter Rows and Columns of the matrix :");
    int row,col;
    scanf("%d%d",&row,&col);
    int matrix[row][col];
    printf("Enter the elements in the matrix : \n");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            printf("element - [%d],[%d] : ",i,j);
            scanf("%d",&matrix[i][j]);
        }
    }

    printf("Addition of the horizontal Diagonal elements is :");
    int sum=0;
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(i+j==row-1){
                sum+=matrix[i][j];
            }
        }
    }
    printf("%d",sum);
}