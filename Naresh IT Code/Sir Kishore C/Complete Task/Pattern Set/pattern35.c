#include<stdio.h>

void pattern(int row ,int col){
    int intitial;
    for(int i=1;i<=row;i++){
        intitial=i;
        for(int j=1;j<=col-i;j++){
            printf("%4c",' ');
        }
        for(int j=1;j<=i;j++){
            printf("%4d",intitial);
            intitial+=i;
        }

        printf("\n");
    }
}

int main(){
    int row,col;
    printf("Enter your Rows and Columns Number : ");
    scanf("%d%d",&row,&col);
    pattern(row,col);
}