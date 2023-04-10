#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	
	int money, choice, change, changeMoney;
	double USD,JPY,EUR,CNY,GBP; 
	
	printf("환전을 원하는 금액을 입력하세요. (원화) : ");
	scanf("%d",&money);
	printf("환전할 외화를 선택하세요. (1:USD, 2:JPY, 3:EUR, 4:CNY, 5:GBP) : ");
	scanf("%d",&choice);
	
	switch(choice){
	
		case 1:
			USD = 1320.00;
			change = (int)(money/USD);
			changeMoney = money-(int)(USD *change);
			printf("기준 환율 : %.2f\n",USD);
			printf("환전 결과\n");
			printf("달러 : %d달러\n",change);
			printf("거스름돈 : %d원\n",(changeMoney/10)*10);
			break; 
		case 2:
			JPY = 9.96;
			change = (int)(money/JPY);
			changeMoney = money-(int)(JPY *change);
			printf("기준 환율 : %.2f\n",JPY);
			printf("환전 결과\n");
			printf("엔 : %d엔\n",change);
			printf("거스름돈 : %d원\n",(changeMoney/10)*10);
			break; 
		case 3:
			EUR = 1438.91;
			change = (int)(money/EUR);
			changeMoney = money-(int)(EUR *change);
			printf("기준 환율 : %.2f\n",EUR);
			printf("환전 결과\n");
			printf("유로 : %d유로\n",change);
			printf("거스름돈 : %d원\n",(changeMoney/10)*10);
			break; 
		case 4:
			CNY = 191.85;
			change = (int)(money/CNY);
			changeMoney = money-(int)(CNY *change);
			printf("기준 환율 : %.2f\n",CNY);
			printf("환전 결과\n");
			printf("위안 : %d위안\n",change);
			printf("거스름돈 : %d원\n",(changeMoney/10)*10);
			break; 
		case 5:
			GBP = 1638.49;
			change = (int)(money/GBP);
			changeMoney = money-(int)(GBP *change);
			printf("기준 환율 : %.2f\n",GBP);
			printf("환전 결과\n");
			printf("파운드 : %d파운드\n",change);
			printf("거스름돈 : %d원\n",(changeMoney/10)*10);
			break; 
	
	}
	return 0;
}













