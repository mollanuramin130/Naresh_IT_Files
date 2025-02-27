#include<stdio.h>

int main(){
    int number =321;
    printf("First number : %d\n",number/100);
    number=number-(number/100)*100;
    printf("Second number : %d\nThird number : %d\n",number/10,number%10);
}