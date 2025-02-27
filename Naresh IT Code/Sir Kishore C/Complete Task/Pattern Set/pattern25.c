#include<stdio.h>

void pattern(int row ,int col){
    int initial=1;
    for(int i=1;i<=row;i++){
        for(int j=1;j<=i;j++){
           if(i==1){
            printf("%4d",initial);
           }
           else{
            printf("%4d",initial++);
           }
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