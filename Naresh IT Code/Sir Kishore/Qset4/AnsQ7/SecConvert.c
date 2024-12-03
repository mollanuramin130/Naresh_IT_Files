#include<stdio.h>

int main(){
    int sec;
    printf("Enter value in seconds : ");
    scanf("%d",&sec);
    int hour=sec/3600;
    int remain_sec=sec - hour*3600;
    int minute= remain_sec/60;
    int seconds=remain_sec%60;
    printf("%d hour %d minute %d second\n",hour,minute,seconds);
    return 0;
}