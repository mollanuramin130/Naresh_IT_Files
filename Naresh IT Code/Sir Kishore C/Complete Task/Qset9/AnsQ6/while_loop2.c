#include<stdio.h>

int main(){
    int start,end;
    printf("Enter Start and End Value: ");
    scanf("%d%d",&start,&end);
   
   if(start<=end){
    while (start<=end){
        printf("%d,",start++);
    }
   }
   else{
    while(start>=end){
        printf("%d,",start--);
    }
   }
   
    printf("\b");
    return 0;
}