#include<stdio.h>

int main(){
    int position=1;
    for(int r=1;r<=4;r++){
        for(int c=1;c<=4;c++){
            if(c==position){
                printf("1 ");
            }
            else if(c>position){
                printf("2 ");
            }
            else{
                printf("0 ");
            }
        }
        position++;
        printf("\n");
    }
}