#include<stdio.h>

void pattern_fibonacci(int row ,int col){
    for(int i=1;i<=row;i++){
        int f1=0,f2=1,f3;
        for(int j=1;j<=i;j++){
           printf("%4d",f1);
           f3=f1+f2;
           f1=f2;
           f2=f3;
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