#include<stdio.h>

void pattern(int row ,int col){
    int initial=1;
    char ch='A';
    for(int i=1;i<=row;i++){
        initial=col-1;
        for(int j=col;j>=i;j--){
            printf("%4c",ch+initial--);
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