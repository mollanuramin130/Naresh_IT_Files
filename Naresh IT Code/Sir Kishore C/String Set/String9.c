#include<stdio.h>

int main(){
    char str[30];
    printf("Enter string : ");
    scanf("%[^\n]",str);
    int len=0;
    for(int i=0;str[i]!='\0';i++){
        len++;
    }
    char temp=str[0];
    str[0]=str[len-1];
    str[len-1]=temp;
    printf("After first and Last Character swap String is : %s\n",str);
}