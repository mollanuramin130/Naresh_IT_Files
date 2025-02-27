#include<stdio.h>

void pattern20(int row, int cols){
    for(int i=1;i<=row;i++){
        for(int j=1;j<=cols;j++){
            if(j==(cols+1)/2 || i==(row+1)/2){
                printf("# ");
            }
            else{
                printf("  ");
            }
        }
        printf("\n");
    }
}

int main(){
    int row,cols;
    printf("Enter your row and column : ");
    scanf("%d%d",&row,&cols);
    pattern20(row,cols);
}