#include <stdio.h>
#include <time.h>

int main(void)
{
	time_t t = time(NULL);  // 현재 시간을 얻음
    struct tm *now = localtime(&t);  // 현재 시간을 localtime 함수를 이용하여 tm 구조체로 변환
    
	int year,month;
    year = now->tm_year + 1900;
    month = now->tm_mon + 1;
	
	int day[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	bool yearCheck; 
	
	printf("년도를 입력하시오 : ");
	scanf("%d",&year);
	
	printf("월을 입력하시오 : ");
	scanf("%d",&month);
	
	printf("=========%d년 %d월=========\n",year,month);
	printf("일  월  화  수  목  금  토\n");
	
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
    mktime(&date);  // 입력한 년도와 월의 1일에 해당하는 tm 구조체를 생성

    int start_day = date.tm_wday;  // 0: 일요일, 1: 월요일, ..., 6: 토요일

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
