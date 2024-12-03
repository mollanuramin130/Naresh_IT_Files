#include<stdio.h>

int main(){
    int choice,no_cup;
    float price;
    printf("Tea Menu:\n1. Masala Tea - Rs. 10 per cup\n2. Ginger Tea - Rs. 15 per cup\n3. Lemon Tea - Rs. 20 per cup\nEnter your choice (1/2/3): ");
    scanf("%d",&choice);
    printf("\nEnter the number of cups: ");
    scanf("%d",&no_cup);

    if(choice==1){
        price = 10.0*no_cup;
        printf("Total bill: Rs. %.2f\n",price);
    }
    else if(choice==2){
        price = 15.0*no_cup;
        printf("Total bill: Rs. %.2f\n",price);
    }
    else if(choice==3){
        price = 20.0*no_cup;
        printf("Total bill: Rs. %.2f\n",price);
    }
    else{
        printf("Invalid Choice please enter valid option.\n");
    }
    return 0;
}