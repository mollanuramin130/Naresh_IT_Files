#include<stdio.h>

void pattern_fibonacci(int row ,int col){
    for(int i=1;i<=row;i++){
        
        for(int j=1;j<=i;j++){
          if(j==1 || j==i || i==row){
            printf("%d ",j);
          }
          else{
            printf("  ");
          }
        }
        printf("\n");
    }
}

int main(){
    int row,col;
    printf("Enter your Row And Column numbers : ");
    scanf("%d%d",&row,&col);
    pattern_fibonacci(row,col);
}