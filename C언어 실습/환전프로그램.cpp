#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	
	int money, choiceNum, exchange, changeMoney;
	double USD,JPY,EUR,CNY,GBP; 
	
	printf("환전을 원하는 금액을 입력하세요. (원화) : ");
	scanf("%d",&money);
	printf("환전할 외화를 선택하세요. (1:USD, 2:JPY, 3:EUR, 4:CNY, 5:GBP) : ");
	scanf("%d",&choiceNum);
	
	switch(choiceNum){
	
		case 1:
			USD = 1320.00;
			exchange = (int)(money/USD);
			changeMoney = money-(int)(USD *exchange);
			printf("기준 환율 : %.2f\n",USD);
			printf("환전 결과\n");
			printf("달러 : %d달러\n",exchange);
			printf("거스름돈 : %d원\n",(changeMoney/10)*10);
			break; 
		case 2:
			JPY = 9.96;
			exchange = (int)(money/JPY);
			changeMoney = money-(int)(JPY *exchange);
			printf("기준 환율 : %.2f\n",JPY);
			printf("환전 결과\n");
			printf("엔 : %d엔\n",exchange);
			printf("거스름돈 : %d원\n",(changeMoney/10)*10);
			break; 
		case 3:
			EUR = 1438.91;
			exchange = (int)(money/EUR);
			changeMoney = money-(int)(EUR *exchange);
			printf("기준 환율 : %.2f\n",EUR);
			printf("환전 결과\n");
			printf("유로 : %d유로\n",exchange);
			printf("거스름돈 : %d원\n",(changeMoney/10)*10);
			break; 
		case 4:
			CNY = 191.85;
			exchange = (int)(money/CNY);
			changeMoney = money-(int)(CNY *exchange);
			printf("기준 환율 : %.2f\n",CNY);
			printf("환전 결과\n");
			printf("위안 : %d위안\n",exchange);
			printf("거스름돈 : %d원\n",(changeMoney/10)*10);
			break; 
		case 5:
			GBP = 1638.49;
			exchange = (int)(money/GBP);
			changeMoney = money-(int)(GBP *exchange);
			printf("기준 환율 : %.2f\n",GBP);
			printf("환전 결과\n");
			printf("파운드 : %d파운드\n",exchange);
			printf("거스름돈 : %d원\n",(changeMoney/10)*10);
			break; 
	
	}
	
	int changeMoneyBasket;
	
	printf("500원: %d개\n",changeMoney/500);
	changeMoneyBasket = changeMoney%500;
	
	printf("100원: %d개\n",changeMoneyBasket/100);
	changeMoneyBasket = changeMoneyBasket%100;
	
	printf("50원: %d개\n",changeMoneyBasket/50);
	changeMoneyBasket = changeMoneyBasket%50;
	
	printf("10원: %d개\n",changeMoneyBasket/10);
	
	return 0;
}













