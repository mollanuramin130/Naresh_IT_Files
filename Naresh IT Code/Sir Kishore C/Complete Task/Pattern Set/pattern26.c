#include<stdio.h>

void pattern(int row ,int col){
    int initial=1;
    for(int i=1;i<=row;i++){
        initial=row-1;
        int a=i;
        for(int j=1;j<=i;j++){
           if(j==1){
            printf("%4d",i);
           }
           else{
            printf("%4d",a=a+initial);
            initial--;
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