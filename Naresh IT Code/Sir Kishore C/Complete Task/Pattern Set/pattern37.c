#include<stdio.h>

void pattern(int row){
    for(int i=1;i<=row;i++){
        for(int j=1;j<=row-i;j++){
            printf("%4c",' ');
        }
        for(int j=2*i-1;j>=1;j--){
            printf("%4d",j);
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