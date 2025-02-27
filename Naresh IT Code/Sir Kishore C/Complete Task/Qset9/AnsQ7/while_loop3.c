#include<stdio.h>

int main(){
    char ch='a';
    printf("Character and its ASCII Value:\n");
    while(ch<='z'){
        printf("%c : %d\n",ch,ch++);

    }
    return 0;
}