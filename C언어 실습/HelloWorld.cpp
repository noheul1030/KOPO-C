#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
// 1. �Է��� ���� Ȧ������ ¦�������� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
/*
	int number ;
	
	scanf("%d",&number);
	
	if(number%2 == 0){
		printf("¦���Դϴ�.\n");
	}else {
		printf("Ȧ���Դϴ�.\n");
	}
	
*/	
// 2. �� ���� ���ڸ� �Է� �޾� ū ���� ����ϴ� ���α׷� �ۼ�
/*
	int number1,number2;
	scanf("%d %d",&number1,&number2);
	
	if(number1 < number2){
		printf("ū ���ڴ� %d �Դϴ�.\n",number2);
	}else {
		printf("ū ���ڴ� %d �Դϴ�.\n",number1);
	}
	
*/	
// 3. 5���� ���ڸ� �Է� �޾� ���� ���� ����ϴ� ���α׷� �ۼ�
/*
	int max,min,i,number[5];
	scanf("%d",&number[0]);
	max = number[0];
	min = number[0];
	
	 for(i=1; i<5; i++){
		scanf("%d",&number[i]);
		if(max < number[i]){
			max = number[i];
		}
		if(min > number[i]){
			min = number[i];
		}
	}
	printf("�ִ밪�� %d �Դϴ�.",max);
	printf("�ּҰ��� %d �Դϴ�.",min);
	
*/	
// 4. �������� �ƴ����� �Ǵ��ϴ� ���α׷� �ۼ�	
/*
	int year ;
	printf("���ϴ� �⵵�� �Է��ϼ��� : "); 
	scanf("%d",&year);
	
	if((year % 4 == 0) && (year % 100) != 0 || (year %400) == 0){
		printf("%d���� �����Դϴ�.",year);
	}else{
		printf("%d���� ������ �ƴմϴ�.",year);
	}
	
*/
// 5. �Է��� �⵵�� �� ���� ������ ���� ����ϱ�

	int year,i;
	int day[12] = {31,28,31,30,31,31,30,31,30,31,30,31};
	bool yearCheck;
	printf("���ϴ� �⵵�� �Է��ϼ��� : "); 
	scanf("%d",&year);
	printf("%d���� ������ �����ϴ�.\n",year);
	
	if((year % 4 == 0) && (year % 100) != 0 || (year %400) == 0){
		yearCheck = false;
	}else{
		yearCheck = true;
	}
	
	for(i = 1; i <= 12; i++){
		if(yearCheck == true){
			printf("%d�� : %d��\n",i,day[i-1]);
		}
		else{
			if(i == 2) {
				printf("%d�� : 29��\n",i);
				continue;
			}
			printf("%d�� : %d��\n",i,day[i-1]);
			
		}
	}
	return 0;
}

























