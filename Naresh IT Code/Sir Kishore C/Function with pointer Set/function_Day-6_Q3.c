#include<stdio.h>
void printPairs(int arr[], int size);

int main(){
    printf("Enter the array size : ");
    int size;
    scanf("%d",&size);
    int arr[size];
    printf("Enter the array elements : ");
    for(int i=0;i<size;i++){
        scanf("%d",&arr[i]);
    }
    
    printPairs(arr,size);
}

void printPairs(int arr[], int size){
    
    for(int i=0;i<size/2;i++){
        printf("(%d,%d)\n",arr[i],arr[size-1-i]);
    }
    if(size%2==1){
        printf("(%d)\n",arr[size/2]);
    }
}