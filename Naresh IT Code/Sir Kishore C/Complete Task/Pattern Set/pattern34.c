#include<stdio.h>

void pattern(int row){
    int intitial;
    for(int i=1;i<=row;i++){
            intitial=row;
        for(int j=1;j<=row-i;j++){
            printf("%4c",' ');
            intitial--;
        }
        for(int j=1;j<=i;j++){
            if(intitial%2==1){
                printf("%4d",intitial);
                intitial--;
            }else{
                printf("%4c",'*');
                intitial--;
            }
        }
        printf("\n");
    }
}

int main(){
    int row,col;
    printf("Enter your Rows : ");
    scanf("%d",&row);
    pattern(row);
}