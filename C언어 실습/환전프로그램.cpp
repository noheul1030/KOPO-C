#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	
	int money, choiceNum, exchange, changeMoney;
	double USD,JPY,EUR,CNY,GBP; 
	
	printf("ȯ���� ���ϴ� �ݾ��� �Է��ϼ���. (��ȭ) : ");
	scanf("%d",&money);
	printf("ȯ���� ��ȭ�� �����ϼ���. (1:USD, 2:JPY, 3:EUR, 4:CNY, 5:GBP) : ");
	scanf("%d",&choiceNum);
	
	switch(choiceNum){
	
		case 1:
			USD = 1320.00;
			exchange = (int)(money/USD);
			changeMoney = money-(int)(USD *exchange);
			printf("���� ȯ�� : %.2f\n",USD);
			printf("ȯ�� ���\n");
			printf("�޷� : %d�޷�\n",exchange);
			printf("�Ž����� : %d��\n",(changeMoney/10)*10);
			break; 
		case 2:
			JPY = 9.96;
			exchange = (int)(money/JPY);
			changeMoney = money-(int)(JPY *exchange);
			printf("���� ȯ�� : %.2f\n",JPY);
			printf("ȯ�� ���\n");
			printf("�� : %d��\n",exchange);
			printf("�Ž����� : %d��\n",(changeMoney/10)*10);
			break; 
		case 3:
			EUR = 1438.91;
			exchange = (int)(money/EUR);
			changeMoney = money-(int)(EUR *exchange);
			printf("���� ȯ�� : %.2f\n",EUR);
			printf("ȯ�� ���\n");
			printf("���� : %d����\n",exchange);
			printf("�Ž����� : %d��\n",(changeMoney/10)*10);
			break; 
		case 4:
			CNY = 191.85;
			exchange = (int)(money/CNY);
			changeMoney = money-(int)(CNY *exchange);
			printf("���� ȯ�� : %.2f\n",CNY);
			printf("ȯ�� ���\n");
			printf("���� : %d����\n",exchange);
			printf("�Ž����� : %d��\n",(changeMoney/10)*10);
			break; 
		case 5:
			GBP = 1638.49;
			exchange = (int)(money/GBP);
			changeMoney = money-(int)(GBP *exchange);
			printf("���� ȯ�� : %.2f\n",GBP);
			printf("ȯ�� ���\n");
			printf("�Ŀ�� : %d�Ŀ��\n",exchange);
			printf("�Ž����� : %d��\n",(changeMoney/10)*10);
			break; 
	
	}
	
	int changeMoneyBasket;
	
	printf("500��: %d��\n",changeMoney/500);
	changeMoneyBasket = changeMoney%500;
	
	printf("100��: %d��\n",changeMoneyBasket/100);
	changeMoneyBasket = changeMoneyBasket%100;
	
	printf("50��: %d��\n",changeMoneyBasket/50);
	changeMoneyBasket = changeMoneyBasket%50;
	
	printf("10��: %d��\n",changeMoneyBasket/10);
	
	return 0;
}













