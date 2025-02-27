// My Name Is Nur Output be: M N N
#include<stdio.h>

int main(){
    char str[100];
    int wordCount=1;
    printf("Enter your String : ");
    scanf("%[^\n]",str);

    for(int i=0;str[i]!='\0';i++){
        if(str[i-1]==' '){
            wordCount++;
        }
    }
    printf("%d words\n",wordCount);
}