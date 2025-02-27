#include<stdio.h>

int main(){
    printf("Enter your Charecter : \n");
    char ch1;
    scanf("%c",&ch1);
    ch1>=97&&printf("%c\n",(ch1-32)) || printf("%c\n",(ch1+32));
    return 0;
}