#include<stdio.h>

int main(){
    float unit,bill,total,surcharge;
    printf("Enter the number of units: ");
    scanf("%f",&unit);

    if(unit<=50){
        bill=unit*.50;
    }
    else if(unit<=150){
        bill=50*.50+(unit-50)*.75;
    }
    else if(unit<=250){
        bill=50*.5 + 100*.75 + (unit-150)*1.2;
    }
    else{
        bill=50*.50 + 100*.75 + 100*1.2+(unit-250)*1.5;
    }
    surcharge=bill*.2;
    total=bill+surcharge;
    printf("Total electricity bill: Rs. %.2f\n",total);
}