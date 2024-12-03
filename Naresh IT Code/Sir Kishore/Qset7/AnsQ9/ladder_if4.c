#include<stdio.h>

int main(){
    float unit,price,total,surcharge;
    printf("Enter the number of units: ");
    scanf("%f",&unit);
    if(unit>0){
        if(unit>=50){
            price=50*.50;
            unit=unit-50;
        }
        else{
            price=unit*.50;
            unit=0;
        }
    }
    if(unit>0){
         if(unit>=100){
            price=price+100*.750;
            unit=unit-100;
        }
        else{
            price=price+unit*.750;
            unit=0;
        }
    }
    if(unit>0){
         if(unit>=100){
            price=price+100*1.20;
            unit=unit-100;
        }
        else{
            price=price+unit*1.20;
            unit=0;
        }
    }
    if(unit>0){
         price=price+unit*1.5;
    }
    surcharge=price*.2;
    printf("Total electricity bill: Rs. %.2f\n",price+surcharge);
    return 0;
}