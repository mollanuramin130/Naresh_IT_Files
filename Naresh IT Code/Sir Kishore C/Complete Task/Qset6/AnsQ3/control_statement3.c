#include<stdio.h>

int main(){
    char alpha;
    printf("Enter a Character : ");
    scanf("%c",&alpha);
    if(alpha>='a' && alpha<= 'z'){
        printf("lower case\n");
    }
    if(alpha>='A' && alpha<= 'Z'){
        printf("upper case\n");
    }
}