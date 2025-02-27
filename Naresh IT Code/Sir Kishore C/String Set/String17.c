#include<stdio.h>

int main(){
    printf("enter your String : ");
    char str[50];
    scanf("%[^\n]",str);

    int len=0;
    for(int i=0;str[i];i++){
        len++;
    }
    if(len>0){
        if(str[0]!=' ' && str[0]>='a' && str[0]<='z'){
            str[0]=str[0]-32;
        }
        for(int i=0;str[i];i++){
            if(str[i]==' ' && str[i+1]!=' '){
                if(str[i+1]>='a' && str[i+1]<='z'){
                    str[i+1]=str[i+1]-32;
                }
            }
        }
    }
    printf("Final Uppercase String :\n%s\n",str);
}