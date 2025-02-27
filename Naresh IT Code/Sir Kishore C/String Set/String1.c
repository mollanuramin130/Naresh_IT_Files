#include<stdio.h>

int main(){
    char str[100];
    printf("Enter a String: ");
    //gets(str);
    scanf("%[^\n]",str);
    
    printf("%s\n",str);
}