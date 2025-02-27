#include<stdio.h>

void pattern(int row){
    for(int i=row;i>=1;i--){
        for(int j=1;j<=row-i;j++){
            printf("%4c",' ');
        }
       for(int j=1;j<=i*2-1;j++){
        printf("%4c",'*');
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