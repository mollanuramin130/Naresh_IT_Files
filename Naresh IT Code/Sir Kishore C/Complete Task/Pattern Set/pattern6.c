#include<stdio.h>

void pattern6(int row ,int col ){
    for(int i=1;i<=row;i++){
        for(int j=1;j<=col;j++){
            printf("%3d",i*j);
        }
        printf("\n");
    }
}

int main(){
    int row,col;
    printf("Enter row and column no : ");
    
    scanf("%d%d",&row,&col);
    pattern6(row,col);
}