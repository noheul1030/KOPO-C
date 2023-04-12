#include <stdio.h>
#include <time.h>
#include <string.h>
#include <stdlib.h>

int main(){
	srand(time(NULL));
	
	int i = 0;
	while (i != 3){
		i = rand() % 10;
		printf("%d\n",i);
	}
	return 0;
}
