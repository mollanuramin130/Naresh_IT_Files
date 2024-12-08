#include<stdio.h>

int main(){
    int sub1,sub2,sub3;
    printf("Enter three subject marks : ");
    scanf("%d%d%d",&sub1,&sub2,&sub3);
    if(sub1>=35 && sub2>=35 && sub3>=35 ){
        printf("Result is pass\n");
    }
    else{
        printf("Reult is Fail\n");
    }

    return 0;
}