#include<stdio.h>

int main(){
    char ch;
    printf("Enter a character : ");
    scanf("%c",&ch);

    if((ch>='a' && ch<='z') || (ch>='A' && ch <='Z')){
        printf("%c is Alphabet\n",ch);
    }
    else if(ch>='0' && ch<='9'){
        printf("%c is Digit\n",ch);
    }
    else{
        printf("%c is Special character\n",ch);
    }
    return 0;
}