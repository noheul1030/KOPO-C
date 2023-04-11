#include <stdio.h>
#include <windows.h>

int main(){
	int number;
	printf("369게임을 진행할 숫자를 입력해 주세요 : ");
	scanf("%d",&number);
	
	int clapCount;
	for(int i = 1; i <=number; i++){
		int count = 0;
		int iNum = i;
		while(iNum > 0){
			int numberSplit = iNum % 10; // 현재 숫자의 일의 자리 수
            if (numberSplit == 3 || numberSplit == 6 || numberSplit == 9) {
               	count++; // 박수 개수 증가
          	}
           	iNum /= 10; // 다음 자리로 이동
		}
		if(count != 0){
			for(int j = 0; j < count;j++){
				printf("짝!\a");
			}
			printf("\n");
		}else{
			printf("%d\n",i);
		}
		Sleep(500);
	}
	return 0;
}
