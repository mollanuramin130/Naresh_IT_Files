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
    
    int colSumArr[col];
    for(int i=0;i<col;i++){
        colSumArr[i]=0;
    }
    for(int i=0;i<row;i++){
        int sum=0;
        for(int j=0;j<col;j++){
            sum+=matrix[i][j];
            printf("%4d",matrix[i][j]);
            colSumArr[j]+=matrix[i][j];
        }
        printf("%4d\n",sum);
    }
    for(int i=0;i<col;i++){
        printf("%4d",colSumArr[i]);
    }   
printf("\n");
}