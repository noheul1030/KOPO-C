#include <stdio.h>
#include <windows.h>

int main(){
	int number;
	printf("369������ ������ ���ڸ� �Է��� �ּ��� : ");
	scanf("%d",&number);
	
	int clapCount;
	for(int i = 1; i <=number; i++){
		int count = 0;
		int iNum = i;
		while(iNum > 0){
			int numberSplit = iNum % 10; 
            if (numberSplit == 3 || numberSplit == 6 || numberSplit == 9) {
               	count++; 
          	}
           	iNum /= 10; 
		}
		if(count != 0){
			for(int j = 0; j < count;j++){
				printf("¦!\a");
			}
			printf("\n");
		}else{
			printf("%d\n",i);
		}
		Sleep(500);
	}
	return 0;
}
