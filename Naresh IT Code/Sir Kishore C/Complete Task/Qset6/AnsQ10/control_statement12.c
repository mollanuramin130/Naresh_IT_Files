#include<stdio.h>

int main(){
    int temp;
    printf("Enter temperature : ");
    scanf("%d",&temp);
    if(!(temp>30 && printf("The weather is hot.") || temp<15 && printf("The weather is cold."))){
        printf("The weather is normal.");
    }
}