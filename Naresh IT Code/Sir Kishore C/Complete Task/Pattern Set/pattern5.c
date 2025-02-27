#include<stdio.h>

void pattern5(int row ,int col ){
   int initail=col;
    for(int i=1;i<=row;i++){
        for(int j=1;j<=col;j++){
            printf("%d ",initail--);
        }
        initail=col;
        printf("\n");
    }
}

int main(){
    int row,col;
    printf("Enter row and column no : ");
    
    scanf("%d%d",&row,&col);
    pattern5(row,col);
}