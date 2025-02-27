#include<stdio.h>

void pattern(int row ,int col){
    int initial=1;
    for(int i=1;i<=row;i++){
        for(int j=col;j>=i;j--){
            printf("%4d",initial++);
        }
        printf("\n");
    }
}

int main(){
    int row,col;
    printf("Enter your Rows and Columns Number : ");
    scanf("%d%d",&row,&col);
    pattern(row,col);
}