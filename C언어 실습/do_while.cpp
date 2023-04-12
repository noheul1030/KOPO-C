#include <stdio.h>
int main(){
	char input;
//	printf()
//	scanf("%s",&input);
	char i = 'q';
	
	do{
		printf("문자 입력 : ");
		scanf("%c",&input);
//		getch();
		int a;
		scanf("%c",&a); 
	}
	while(i != input);
		printf("종료!");	
	
	return 0;
}
