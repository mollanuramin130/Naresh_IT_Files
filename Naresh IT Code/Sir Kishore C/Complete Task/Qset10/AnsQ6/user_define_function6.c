#include<stdio.h>

long powerValue(int base, int exp){
     
    long value=1;    
    
    while (exp!=0)
    {
        value=value*base;
        exp--;
    }
    return value;
    
}

int main(){
    int base,exp;
    printf("Enter base: ");
    scanf("%d",&base);
    printf("Enter exponent: ");
    scanf("%d",&exp);
    if(base<=0 || exp<=0){
        printf("Invalid input...Please enter positive values\n");
    }
    else
    printf("%d^%d = %ld\n",base,exp,powerValue(base ,exp));
    
    return 0;
}