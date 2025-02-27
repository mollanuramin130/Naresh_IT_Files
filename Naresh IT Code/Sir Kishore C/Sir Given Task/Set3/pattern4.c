#include<stdio.h>

void pattern9(int row ,int col ){
    for(int i=1;i<=row;i++){
        for(int j=1;j<=col-i+1;j++){  
                 printf("%3d",j);
        }
        printf("\n");
    }
}

int main(){
    int row,col;
    printf("Enter row and column no : ");
    
    scanf("%d%d",&row,&col);
    pattern9(row,col);
}