#include<stdio.h>

void pattern(int row ,int col){
    int initial=1;
    for(int i=1;i<=row;i++){
        initial=1;
        for(int j=1;j<=i;j++){
            printf("%d ",initial++);
        }
        printf("\n");
    }
}

int main(){
    int row,col;
    printf("Enter your Row And Column numbers : ");
    scanf("%d%d",&row,&col);
    pattern(row,col);
}