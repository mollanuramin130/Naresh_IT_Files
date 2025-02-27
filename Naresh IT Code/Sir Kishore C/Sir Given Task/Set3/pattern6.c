#include<stdio.h>

void pattern9(int row ,int col ){
    int initial=1;
    for(int i=1;i<=row;i++){
        for(int j=1;j<=col;j++){
            if(j<=col-i){
                printf(" ");
                initial++;
            }
            else{
                printf("%d",initial++);
            }
        }
        printf("\n");
        initial=1;
    }
}

int main(){
    int row,col;
    printf("Enter row and column no : ");
    
    scanf("%d%d",&row,&col);
    pattern9(row,col);
}