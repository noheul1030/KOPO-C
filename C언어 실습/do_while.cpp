#include <stdio.h>
int main(){
	char input;
//	printf()
//	scanf("%s",&input);
	char i = 'q';
	
	do{
		printf("���� �Է� : ");
		scanf("%c",&input);
//		getch();
		int a;
		scanf("%c",&a); 
	}
	while(i != input);
		printf("����!");	
	
	return 0;
}
