#include<stdio.h>

void deleteFun(int arr[],int size,int deleteElement){
    int flag=0;
        for(int i=0;i<size;i++){
            if(arr[i]==deleteElement){
                for(int j=i+1;j<size;j++){
                    arr[j-1]=arr[j];
                }
                size--;
                i--;
                flag=1;
            }
        }
        if(flag==1){
            printf("Array after deletation : ");
            for(int i=0;i<size;i++){
            printf("%d ",arr[i]);
            }
        }
        else{
            printf("Element not found in the array.\n");
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
        int deleteElement;
        printf("Enter the element to be deleted : ");
        scanf("%d",&deleteElement);
        
        deleteFun(arr,size,deleteElement);
    }
}