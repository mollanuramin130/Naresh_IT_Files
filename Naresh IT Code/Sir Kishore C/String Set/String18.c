#include<stdio.h>

int main(){
    printf("enter your String : ");
    char str[50];
    scanf("%[^\n]",str);
    printf("Enter the character you want to remove : ");
    char delChar;
    getchar();
    scanf("%c",&delChar);
    int len=0;
    for(int i=0;str[i];i++){
        len++;
    }
    int nullIndigator=0;
    for(int i=0;i<len;i++){
        if(str[i]==delChar){
            for(int j=i+1;str[j];j++){
                str[j-1]=str[j];
            }
            str[len - ++nullIndigator]='\0';
            i--;

        }
    }
    
    printf("Final Uppercase String :\n%s\n",str);
}