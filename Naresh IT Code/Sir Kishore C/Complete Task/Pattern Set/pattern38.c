#include<stdio.h>

void pattern(int row){
    for(int i=1;i<=row;i++){
        int start=i,flag=1;

        for(int j=1;j<=row-i;j++){
            printf("%4c",' ');
        }
        
        for(int j=1;j<=2*i-1;j++){
            if(flag){
                printf("%4d",start--);
                if(start==0){
                    start=1;
                    flag=0;
                }
            }
            else{
                printf("%4d",++start);
            }
        }
        printf("\n");
    }
}

int main(){
    int row;
    printf("Enter your row number : ");
    scanf("%d",&row);
    pattern(row);
}