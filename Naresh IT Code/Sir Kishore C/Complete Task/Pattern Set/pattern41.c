#include<stdio.h>

void pattern(int row){
    for(int i=1;i<=row;i++){
       int start=1;
       for(int j=1;j<=i;j++){
        printf("%4d",start++);
       }
       printf("\n");
    }
    for(int i=row-1;i>=1;i--){
        int start=1;
        for(int j=1;j<=i;j++){
            printf("%4d",start++);
        }
        printf("\n");
    }
}

int main(){
    int row;
    printf("Enter your row number : ");
    scanf("%d",&row);
    pattern(row);
}