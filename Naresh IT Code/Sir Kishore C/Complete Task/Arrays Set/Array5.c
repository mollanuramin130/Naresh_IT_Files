#include<stdio.h>

int main(){
    int size;
    printf("Enter the size of the array: ");
    scanf("%d",&size);
    int arr[size],arr_copy[size];

    printf("Enter %d elements:\n",size);

    for(int i=0;i<size;i++){
        printf("Element at index %d: ",i);
        scanf("%d",&arr[i]);
    }
    for(int i=0;i<size;i++){
        arr_copy[i]=arr[i];
    }

    printf("The elements stored in the first array are :");
    for(int i=0;i<size;i++){
        printf("%d ",arr[i]);
    }
    printf("\n");
    printf("The elements stored in the Copy array are :");
    for(int i=0;i<size;i++){
        printf("%d ",arr_copy[i]);
    }
    
    
}