#include<stdio.h>

int main(){
    int time;
    printf("Enter time : ");
    scanf("%d",&time);
    if(!(time>=0 && time<=5 && printf("It is Night\n") || time>=6 && time<=11 && printf("It is Morning\n") || time>=12 && time<=17 && printf("It is Afternoon\n") || time>=18 && time<=23 && printf("It is Evening\n"))){
        printf("Enter valid time 0-23\n");
    }

}