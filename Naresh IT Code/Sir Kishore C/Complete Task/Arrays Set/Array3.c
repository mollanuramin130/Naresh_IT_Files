#include<stdio.h>

int main(){
    int size,sum=0;
    printf("Enter the size of the array: ");
    scanf("%d",&size);
    int arr[size];
    printf("Enter %d elements:\n",size);

    for(int i=0;i<size;i++){
        printf("Element at index %d: ",i);
        scanf("%d",&arr[i]);
    }
    printf("\n");
    
    for(int i=0;i<size;i++){
        if(arr[i]%2==0){
            sum+=arr[i];
        }
    }
    printf("sum of all even numbers in the array is = %d\n",sum);
    printf("\n");
}