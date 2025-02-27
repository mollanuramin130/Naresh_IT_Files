#include<stdio.h>

void pattern9(int row ,int col ){
    int initial;
    for(int i=1;i<=row;i++){
        initial=1;
        for(int j=1;j<=col;j++){  
            if(j%2==1){
                printf("%3d",i);
            }          
            else{
                printf("%3d",initial++);
            }         
        }
        printf("\n");
    }
}

int main(){
    int row,col;
    printf("Enter row and column no : ");
    
    scanf("%d%d",&row,&col);
    pattern9(row,col);
}