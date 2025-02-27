#include<stdio.h>

int main(){
    float price,selling_price,profit,loss;
    printf("Enter Cost Price: ");
    scanf("%f",&price);
    printf("Enter Selling Price: ");
    scanf("%f",&selling_price);
    if((selling_price-price)>0){
        printf("Profit is: %.2f\n",(selling_price-price));
    }
    else if((selling_price-price)<0){
         printf("Loss is: %.2f\n",(price-selling_price));
    }
    else{
        printf("No profit or loss.\n");
    }
    return 0;
}