#include<stdio.h>

void insertElement(int arr[],int size,int newElement,int index){
    if(index>size+1 || index<0){
        printf("Invalid position ! Position should be between 1 and %d\n",size);
    }
    else{
        for(int i=size-1;i>=index-1;i--){
        arr[i+1]=arr[i];
        }
        arr[index-1]=newElement;
        printf("Array after insertion at %d index : ",index);
        for(int i=0;i<=size;i++){
            printf("%d ",arr[i]);
        }
        printf("\n");
        }
}

int main(){
    printf("Enter your Array size : ");
    int size;
    scanf("%d",&size);
     if(size<=0){
        printf("Invalid Size...\n");
    }
    else{       
        int arr[size+1];
        printf("Enter %d Array Elements : ",size);
    
        for(int i=0;i<size;i++){
            scanf("%d",&arr[i]);
        }
        int newElement,index;
        printf("Enter the element to be insert : ");
        scanf("%d",&newElement);
        printf("Enter the position: ");
        scanf("%d",&index);
        insertElement(arr,size,newElement,index);
    }
}