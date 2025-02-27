#include<stdio.h>

int main(){
    int row=4,col=4;
    char str[5]="star";
    int intial=0;
    for(int i=1;i<=row;i++){
        for(int j=1;j<=col;j++){
            if(i==j){
                printf("%3c",str[intial++]);
            }
            else{
                printf("%3c",'*');
            }
        }
        printf("\n");
    }
}