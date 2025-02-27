#include <stdio.h> 
int main() { 
  int count=1;
  for(int r=1;r<=4;r++){
	for(int c=1;c<=4;c++){
		if(r==1 || r==4){
            printf("* ");
        }
        else{
            if (c==1 || c==4)
            {
                printf("* ");
            }
            else{
                printf("%d ",count++);
            }
            
        }
	}
	printf("\n");
  }
	return 0;

  }