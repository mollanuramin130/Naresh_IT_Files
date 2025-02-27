#include<stdio.h>

int main(){
    char ch='A';
    printf("Character and its ASCII Value:\n");
    while(ch<='Z'){
        printf("%c : %d\n",ch,ch++);

    }
    return 0;
}