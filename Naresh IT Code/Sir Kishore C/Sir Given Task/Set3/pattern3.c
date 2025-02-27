#include<stdio.h>

int main(){
    int position=4,position_value=1;
    for(int r=1;r<=4;r++){
        for(int c=1;c<=4;c++){
            if(c<position){
                printf("1 ");
            }
            else{
                printf("%d ",position_value);
            }
        }
        position--;
        position_value++;
        printf("\n");
    }
}