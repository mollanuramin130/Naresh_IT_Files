#include<stdio.h>

int main(){
    char str[50];
    printf("Enter a string : ");
    scanf("%[^\n]",str);
   
    for(int i=0;str[i];i++){
        if(str[i]==' '){
            for(int j=i;str[j];j++){
                str[j]=str[j+1];
            }
        }
    }
    printf("The Final string without Space is: %s\n",str);
}