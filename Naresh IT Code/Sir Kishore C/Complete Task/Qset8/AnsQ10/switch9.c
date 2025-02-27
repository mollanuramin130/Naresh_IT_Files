#include<stdio.h>

int main(){
    float balance;
    char type;
    float amount;

    printf("Initialize the minimum balance : ");
    scanf("%f",&balance);
    switch (balance>=2000.0)
    {
    case 1:
        printf("Enter d (for deposit) w(for withdral) : ");
        getchar();
        scanf("%c",&type);
        if(type>='A' && type<='Z'){
            type +=32;
        }
        switch(type){
            case 'd':
            printf("Enter Deposit Amount : ");
            scanf("%f",&amount);
            if(amount>0.0){
                balance=balance+amount;
                printf("Your Balance : %.2f\n",balance);
            }
            else{
                printf("Invalid amount\n");
            }
            break;

            case 'w':
            printf("Enter Withdral Amount : ");
            scanf("%f",&amount);
            if(amount>0.0 && amount<=balance){
                balance=balance-amount;
                printf("Your Balance : %.2f\n",balance);
            }
            else{
                printf("Invalid amount\n");
            }
            break;
        }
        break;
    case 0:
        balance=0;
        printf("Initial balance must be equal or greater than 2000\n");    
    }

    return 0;
}