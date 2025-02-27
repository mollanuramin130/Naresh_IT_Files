#include<stdio.h>

int main(){
    printf("Input Rows and Columns of the 1st matrix :");
    int row1,col1,row2,col2;
    scanf("%d%d",&row1,&col1);
    printf("Input Rows and Columns of the 2nd matrix :");
    scanf("%d%d",&row2,&col2);
    int matrix1[row1][col1];
    int matrix2[row2][col2];

    printf("Input elements in the first matrix : \n");
    for(int i=0;i<row1;i++){
        for(int j=0;j<col1;j++){
            printf("element - [%d],[%d] : ",i,j);
            scanf("%d",&matrix1[i][j]);
        }
    }
    printf("Input elements in the second matrix : \n");
    for(int i=0;i<row2;i++){
        for(int j=0;j<col2;j++){
            printf("element - [%d],[%d] : ",i,j);
            scanf("%d",&matrix2[i][j]);
        }
    }

    printf("First Matrix is :\n");
    for(int i=0;i<row1;i++){
        for(int j=0;j<col1;j++){
            printf("%d ",matrix1[i][j]);
        }
        printf("\n");
    }

    printf("Second Matrix is :\n");
    for(int i=0;i<row2;i++){
        for(int j=0;j<col2;j++){
            printf("%d ",matrix2[i][j]);
        }
        printf("\n");
    }
    if (row1!=row2 || col1!=col2)
    {
        printf("Two Matrix are not equal.\n");
    }
    else{
        printf("The Addition of two matrices is: ");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                printf("%4d",matrix1[i][j]+matrix2[i][j]);
            }
            printf("\n");
        }
    }

}