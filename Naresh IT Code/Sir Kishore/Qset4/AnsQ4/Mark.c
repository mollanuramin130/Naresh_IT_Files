#include<stdio.h>

int main(){
    int sub1,sub2,sub3,sub4,sub5;
    printf("Enter your 5 Subject Marks : \n");
    scanf("%d%d%d%d%d",&sub1,&sub2,&sub3,&sub4,&sub5);
    int pass=0;
    (sub1>=35 && pass++);
    (sub2>=35 && pass++);
    (sub3>=35 && pass++);
    (sub4>=35 && pass++);
    (sub5>=35 && pass++);
    printf("Pass in %d subject and fail in %d subject \n",pass,5-pass);
}