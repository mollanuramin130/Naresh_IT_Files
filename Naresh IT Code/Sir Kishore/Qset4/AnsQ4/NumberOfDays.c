#include<stdio.h>

int main(){
    int totalDays;
    printf("Enter the value in Days : \n");
    scanf("%d",&totalDays);
    int years=totalDays/365;
    int months=(totalDays-(years*365))/30;
    int days=(totalDays-(years*365))%30;
    printf("%d year %d month %d days.\n",years,months,days);
}