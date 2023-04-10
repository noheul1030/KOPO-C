#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
// 1. 입력한 값이 홀수인지 짝수인지를 판별하는 프로그램을 작성하시오.
/*
	int number ;
	
	scanf("%d",&number);
	
	if(number%2 == 0){
		printf("짝수입니다.\n");
	}else {
		printf("홀수입니다.\n");
	}
	
*/	
// 2. 두 개의 숫자를 입력 받아 큰 수를 출력하는 프로그램 작성
/*
	int number1,number2;
	scanf("%d %d",&number1,&number2);
	
	if(number1 < number2){
		printf("큰 숫자는 %d 입니다.\n",number2);
	}else {
		printf("큰 숫자는 %d 입니다.\n",number1);
	}
	
*/	
// 3. 5개의 숫자를 입력 받아 최저 값을 출력하는 프로그램 작성
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
	printf("최대값은 %d 입니다.",max);
	printf("최소값은 %d 입니다.",min);
	
*/	
// 4. 윤년인지 아닌지를 판단하는 프로그램 작성	
/*
	int year ;
	printf("원하는 년도를 입력하세요 : "); 
	scanf("%d",&year);
	
	if((year % 4 == 0) && (year % 100) != 0 || (year %400) == 0){
		printf("%d년은 윤년입니다.",year);
	}else{
		printf("%d년은 윤년이 아닙니다.",year);
	}
	
*/
// 5. 입력한 년도의 각 월의 마지막 날을 출력하기

	int year,i;
	int day[12] = {31,28,31,30,31,31,30,31,30,31,30,31};
	bool yearCheck;
	printf("원하는 년도를 입력하세요 : "); 
	scanf("%d",&year);
	printf("%d년은 다음과 같습니다.\n",year);
	
	if((year % 4 == 0) && (year % 100) != 0 || (year %400) == 0){
		yearCheck = false;
	}else{
		yearCheck = true;
	}
	
	for(i = 1; i <= 12; i++){
		if(yearCheck == true){
			printf("%d월 : %d일\n",i,day[i-1]);
		}
		else{
			if(i == 2) {
				printf("%d월 : 29일\n",i);
				continue;
			}
			printf("%d월 : %d일\n",i,day[i-1]);
			
		}
	}
	return 0;
}

























