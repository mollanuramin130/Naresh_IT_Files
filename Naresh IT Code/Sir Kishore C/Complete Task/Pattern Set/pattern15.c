#include<stdio.h>

void pattern11(int row ,int col){
    int start=1;
    int restart=1;
    for(int i=1;i<=row;i++){
        start=restart;
        for(int j=1;j<=col;j++){
            if(i%2==1){
                printf("%3d",start++);
                restart++;
            }
            else{
                printf("%3d",--start+col);
                restart++;
            }
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