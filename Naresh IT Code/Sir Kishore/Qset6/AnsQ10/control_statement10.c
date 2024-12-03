#include<stdio.h>

int main(){
    int cost,selling;
    printf("Cost Price: ");
    scanf("%d",&cost);
    printf("selling Price: ");
    scanf("%d",&selling);
    if(!((selling - cost)>0 && printf("The transaction was profitable.\n"))){
        printf("The transaction was loss-making.\n");
    }
    return 0;
}