#include<stdio.h>
 int main (){
    char hash='#';

    for(int i=0;i<5;i++){
        if(i==0 | i==4){
            for(int j=0;j<5;j++){
                printf(" %c",hash);
            }
            printf("\n");
        }
        if (i>=1 && i<4){
            for(int j=0;j<5;j++){
                if(j==0 | j==4){
                    printf(" %c",hash);
                }
                else{
                    printf("  ");
                }
            }
            printf("\n");
        }        
    }
 }