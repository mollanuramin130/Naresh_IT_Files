// My Name Is Nur Output be: M N N
#include<stdio.h>

int main(){
    char str[100];
    printf("Enter your String : ");
    scanf("%[^\n]",str);

    for(int i=0;str[i]!='\0';i++){
        if(i==0 || str[i-1]==' '){
            if(str[i]>='a' && str[i]<='z'){
                printf("%c ",str[i]-32);
            }
            else{
                printf("%c ",str[i]);
            }
        }
    }
    printf("\n");
}