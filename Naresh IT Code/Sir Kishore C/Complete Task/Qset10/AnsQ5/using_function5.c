#include<stdio.h>
void table(int number){
    int i=1;
    while (i<=10)
    {
        printf("%d * %d = %d\n",number,i,number*i++);
    }
    
}
int main(){
    int number;
    printf("Enter number : ");
    scanf("%d",&number);
    table(number);
    return 0;
}