#include<stdio.h>

int main(){
    float cost_price;
    printf("Enter product Cost in Rs. ");
    scanf("%f",&cost_price);

    float selling_price= cost_price+((27.0/100)*cost_price);
    printf("Product Selling price : %.2f\n",selling_price);

    float profit=selling_price-cost_price;
    printf("profit %.2f\n",profit);

    float vat=(12.7/100)*selling_price;
    printf("VAT : %.2f\n",vat);

    float service_charge=(3.87/100)*selling_price;
    printf("Service Charge : %.2f\n",service_charge);

    return 0;
}