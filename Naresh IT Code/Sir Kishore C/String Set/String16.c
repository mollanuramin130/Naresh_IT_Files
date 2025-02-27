#include<stdio.h>

int main(){
    printf("enter your String : ");
    char str[50];
    scanf("%[^\n]",str);
    int startIndex,endIndex;
    printf("Enter the starting index number : ");
    scanf("%d",&startIndex);
    printf("Enter the ending index number : ");
    scanf("%d",&endIndex);

    int len=0;
    for(int i=0;str[i];i++){
        len++;
    }
    for(int i=startIndex;i<endIndex;i++){
        if(str[i]>='a' && str[i]<='z'){
            str[i]=str[i]-32;
        }
    }
    printf("Final Uppercase String :\n%s\n",str);
}