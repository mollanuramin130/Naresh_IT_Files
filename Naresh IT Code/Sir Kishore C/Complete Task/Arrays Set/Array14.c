#include<stdio.h>

void arrayEleFrequency(int arr[],int size){ 
    int arr2[size];
    int count;
    for(int i=0;i<size;i++){
        count=1;
        if(arr2[i]!=-1){
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr2[j]=-1;
                }
            }
            arr2[i]=count;
        }
    } 
    for(int i=0;i<size;i++){
        if(arr2[i]!=-1){
            printf("%d occuurs %d times \n",arr[i],arr2[i]);
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
        arrayEleFrequency(arr,size);
    }
}