#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	
	int money, choice, change, changeMoney;
	double USD,JPY,EUR,CNY,GBP; 
	
	printf("ȯ���� ���ϴ� �ݾ��� �Է��ϼ���. (��ȭ) : ");
	scanf("%d",&money);
	printf("ȯ���� ��ȭ�� �����ϼ���. (1:USD, 2:JPY, 3:EUR, 4:CNY, 5:GBP) : ");
	scanf("%d",&choice);
	
	switch(choice){
	
		case 1:
			USD = 1320.00;
			change = (int)(money/USD);
			changeMoney = money-(int)(USD *change);
			printf("���� ȯ�� : %.2f\n",USD);
			printf("ȯ�� ���\n");
			printf("�޷� : %d�޷�\n",change);
			printf("�Ž����� : %d��\n",(changeMoney/10)*10);
			break; 
		case 2:
			JPY = 9.96;
			change = (int)(money/JPY);
			changeMoney = money-(int)(JPY *change);
			printf("���� ȯ�� : %.2f\n",JPY);
			printf("ȯ�� ���\n");
			printf("�� : %d��\n",change);
			printf("�Ž����� : %d��\n",(changeMoney/10)*10);
			break; 
		case 3:
			EUR = 1438.91;
			change = (int)(money/EUR);
			changeMoney = money-(int)(EUR *change);
			printf("���� ȯ�� : %.2f\n",EUR);
			printf("ȯ�� ���\n");
			printf("���� : %d����\n",change);
			printf("�Ž����� : %d��\n",(changeMoney/10)*10);
			break; 
		case 4:
			CNY = 191.85;
			change = (int)(money/CNY);
			changeMoney = money-(int)(CNY *change);
			printf("���� ȯ�� : %.2f\n",CNY);
			printf("ȯ�� ���\n");
			printf("���� : %d����\n",change);
			printf("�Ž����� : %d��\n",(changeMoney/10)*10);
			break; 
		case 5:
			GBP = 1638.49;
			change = (int)(money/GBP);
			changeMoney = money-(int)(GBP *change);
			printf("���� ȯ�� : %.2f\n",GBP);
			printf("ȯ�� ���\n");
			printf("�Ŀ�� : %d�Ŀ��\n",change);
			printf("�Ž����� : %d��\n",(changeMoney/10)*10);
			break; 
	
	}
	return 0;
}













