#include<stdio.h>

void arrayRotate(int arr[],int size){
    
    
    printf("The missing elements are : ");
    for(int i=0;i<size;i++){
        for(int j=i+1;j<size;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    int max=arr[size-1];
    int min=arr[0];
    for(int i=min;i<max;i++){
        int flag=1;
        for(int j=0;j<size;j++){
            if(i==arr[j]){
                flag=0;
                break;
            }
        }
        if(flag){
            printf("%d ",i);
        }
    }
    
    printf("\n");
}

int main(){
    printf("Enter your Array size : ");
    int size;
    scanf("%d",&size);
     if(size<=0){
        printf("Invalid Size...\n");
    }
    else{       
        int arr[size];
        printf("Enter %d Array Elements : ",size);
    
        for(int i=0;i<size;i++){
            scanf("%d",&arr[i]);
        }
        arrayRotate(arr,size);
    }
}