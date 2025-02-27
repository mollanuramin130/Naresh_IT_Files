#include<stdio.h>

int main(){
    int no_of_ticket,age;
    int ticket_price=300;
    printf("Number of tickets : ");
    scanf("%d",&no_of_ticket);
    printf("age of the passenger : ");
    scanf("%d",&age);
    float total=no_of_ticket*ticket_price;
    float discount=total*(20.0/100);
    
    (age>=60 && age<=100)?(
    
    printf("Total cost before discount: Rs. %.2f\nDiscount amount: Rs. %.2f\nTotal cost after discount: Rs. %.2f\n",total,discount,(total-discount))
    ):(

    printf("Total cost before discount: Rs. %.2f\nDiscount amount: Rs. %.2f\nTotal cost after discount: Rs. %.2f\n",total,0.0,(total))
    );
    return 0;
}