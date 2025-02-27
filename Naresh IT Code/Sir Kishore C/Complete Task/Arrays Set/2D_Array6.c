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

    printf("The Matrix transpose is :\n");
    for(int i=0;i<row;i++){
        for(int j=0;j<=i;j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
    }
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            printf("%4d",matrix[i][j]);
        }
        printf("\n");
    }
}