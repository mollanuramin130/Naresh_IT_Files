#include<stdio.h>

int main(){
    int size;
    printf("Enter the size of the array: ");
    scanf("%d",&size);
    int arr[size];
    printf("Enter %d elements:\n",size);

    for(int i=0;i<size;i++){
        printf("Element at index %d: ",i);
        scanf("%d",&arr[i]);
    }

    printf("The elements in the array are:\n");

    for(int i=0;i<size;i++){
        printf("Element at index %d: %d\n",i,arr[i]);
    }
}