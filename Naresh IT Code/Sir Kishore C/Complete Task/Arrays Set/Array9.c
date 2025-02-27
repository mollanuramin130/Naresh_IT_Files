#include<stdio.h>
int isPrime(int number);

void primeNumberFind(int arr[],int size){
    printf("Prime numbers in the array: ");
    for(int i=0;i<size;i++){
        if(isPrime(arr[i])){
            printf("%d ",arr[i]);
        }
    }
    printf("\n");
}

int isPrime(int number){
    if(number<=1){
        return 0;
    }else{
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                return 0;
            }
        }
    }
    return 1;
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
        
        primeNumberFind(arr,size);
    }
}