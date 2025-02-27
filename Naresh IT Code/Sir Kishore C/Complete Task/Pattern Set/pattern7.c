#include<stdio.h>

void pattern7(int row ,int col ){
    for(int i=1;i<=row;i++){
        for(int j=1;j<=col;j++){
            
            printf("%d ",(i+j)%2);
            
        }
        printf("\n");
    }
}

int main(){
    int row,col;
    printf("Enter row and column no : ");
    
    scanf("%d%d",&row,&col);
    pattern7(row,col);
}