#include<stdio.h>

int main(){
    printf("Enter Rows and Columns of the matrix : ");
    int row,col;
    scanf("%d%d",&row,&col);
    
    int matrix[row][col];
    
    printf("Enter elements of matrix : \n");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            printf("element - [%d],[%d] : ",i,j);
            scanf("%d",&matrix[i][j]);
        }
    }
    
    for(int i=0;i<row;i++){
        int max=matrix[i][0];
        for(int j=0;j<col;j++){
            if(max<matrix[i][j]){
                max=matrix[i][j];
            }
        }
        printf("Maximum element of row %d: %d\n",i+1,max);
    }

}