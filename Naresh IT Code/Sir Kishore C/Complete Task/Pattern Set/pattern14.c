#include<stdio.h>

void pattern11(int row ,int col){
    int start=1;
    for(int i=1;i<=row;i++){
        int a=0;
        for(int j=1;j<=col;j++){
            int initial=start+i-1;
            printf("%3d",(initial+a));
            a=a+row;
        }
        printf("\n");
    }
}

int main(){
    int row ,col;
    printf("Enter your Row and Column Numbers : ");
    scanf("%d%d",&row,&col);
    pattern11(row,col);
}