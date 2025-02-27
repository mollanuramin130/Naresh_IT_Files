#include<stdio.h>

int main(){
    int items;
    printf("Enter no.of items purchased: ");
    scanf("%d",&items);
    if(!(items>=10 && printf("The customer is eligible for a discount.\n"))){
        printf("The customer is not eligible for a discount.\n");
    }
}