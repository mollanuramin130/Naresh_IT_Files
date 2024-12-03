#include<stdio.h>

int main(){
    float sale,da,commission,bonus;
    int basic =10000;
    bonus=basic*(65.5/100);
    printf("Enter your sales : ");
    scanf("%f",&sale);
    if(sale>=100000){
        commission=sale*.1;
    }
    else{
        commission=sale*.05;
    }
    float salary=commission+basic+da+bonus;
    printf("Sales man gross salary : %.2f\n",salary);
}