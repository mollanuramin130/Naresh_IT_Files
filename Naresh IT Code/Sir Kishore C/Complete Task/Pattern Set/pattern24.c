#include<stdio.h>

void pattern(int row ,int col){
    int initial=1;
    for(int i=1;i<=row;i++){
        initial=(i-1)*2+1;
        for(int j=1;j<=i;j++){
            printf("%4d ",initial);
            initial+=2;
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