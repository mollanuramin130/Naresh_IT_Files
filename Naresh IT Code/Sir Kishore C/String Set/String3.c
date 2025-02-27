#include<stdio.h>

int main(){
    char str[100];
    printf("Enter a String: ");
    //gets(str);
    scanf("%[^\n]",str);

    int strLen=0;
    //strLen=printf("%s",str);

    for(int i=0;str[i];i++){ //here str[i] means str[i] !='\0'
        strLen++;
    }

    //for reverse
    for(int i=0;i<strLen-i;i++){
        char temp=str[i];
        str[i]=str[strLen-i-1];
        str[strLen-i-1]=temp;
    }
    
    printf("Reverse string is: %s\n",str);
}