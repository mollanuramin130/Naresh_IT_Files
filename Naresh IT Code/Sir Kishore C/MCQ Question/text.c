#include <stdio.h> 
int main() { 
  int count=0;
  for(int r=1;r<=4;r++){
	for(int c=1;c<=4;c++){
		if(c%2==1){
			printf("%c ",65+count);
		}
		else{
			printf("%c ",97+count++);
		}
	}
	printf("\n");
	count=0;
  }
	return 0;

  }