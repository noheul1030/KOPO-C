#include <stdio.h>
#include <time.h>

int main(void)
{
	time_t t = time(NULL);  // ���� �ð��� ����
    struct tm *now = localtime(&t);  // ���� �ð��� localtime �Լ��� �̿��Ͽ� tm ����ü�� ��ȯ
    
	int year,month;
    year = now->tm_year + 1900;
    month = now->tm_mon + 1;
	
	int day[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	bool yearCheck; 
	
	printf("�⵵�� �Է��Ͻÿ� : ");
	scanf("%d",&year);
	
	printf("���� �Է��Ͻÿ� : ");
	scanf("%d",&month);
	
	printf("=========%d�� %d��=========\n",year,month);
	printf("��  ��  ȭ  ��  ��  ��  ��\n");
	
	if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        yearCheck = true;
        day[1] = 29;
    }
    
    int total_days = 0;
    for (int i = 0; i < month; i++) {
        total_days = day[i];
    }
    
    struct tm date = {0};
    date.tm_year = year - 1900;
    date.tm_mon = month - 1;
    date.tm_mday = 1;
    mktime(&date);  // �Է��� �⵵�� ���� 1�Ͽ� �ش��ϴ� tm ����ü�� ����

    int start_day = date.tm_wday;  // 0: �Ͽ���, 1: ������, ..., 6: �����

	for (int i = 0; i < start_day; i++) {
        printf("    ");
    }
    for (int i = 1; i <= total_days; i++) {
        printf("%2d  ", i);
        start_day++;
        if (start_day % 7 == 0) {
            printf("\n");
        }
    }
    printf("\n");
	
	return 0;
}
