#include<stdio.h>

void uniqueElement(int arr[],int size){
    int arr2[size];
    printf("Unique elements in the array : ");
    for(int i=0;i<size;i++){
        int count=1;
        for(int j=0;j<size;j++){
            if(arr[i]==arr[j]){
                count++;
            }
        }
        if(count==2){
            printf("%d ",arr[i]);
        }
    }
    printf("\n");
}

int main(){
    printf("Enter your array size : ");
    int size;
    scanf("%d",&size);
    int arr[size];
    printf("Enter the %d array elements : ",size);
    for (int i = 0; i < size; i++)
    {
        scanf("%d",&arr[i]);
    }
    
    uniqueElement(arr,size);
}