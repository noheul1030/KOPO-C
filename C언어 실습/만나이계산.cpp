#include <stdio.h>
#include <time.h>
#include <string.h>

int main(void)
{
//	char resident_Registration_Number1[0];
//	char resident_Registration_Number2[12];
//	int change_Number[14];
//	int length = sizeof(change_Number)/sizeof(int);
//	 
//	printf("-를 제외한 주민번호를 입력하세요 : "); 
//	scanf("%s",resident_Registration_Number); 
//	printf("%s\n",resident_Registration_Number);
//	
//	for(int i = 2; i < length; i++){
//		printf("%s\n",resident_Registration_Number[i-2]);
//		change_Number[i]= resident_Registration_Number[i-2];
//		
//		if(i == 9 && resident_Registration_Number[i] == 1 || 2){
//			change_Number[0] = 1;
//			change_Number[1] = 9;
//		}else {
//			change_Number[0] = 2;
//			change_Number[1] = 0;
//		}
//	
//	}
//	printf("숫자를 한 자리씩 자른 결과: ");
//    for (int i = 0; i < length; i++) {
//        printf("%d ", change_Number[i]);
//    }
//    printf("\n");

	
	
	
	// 현재 시간 구하기
    time_t now = time(NULL);
    struct tm *local_time = localtime(&now);

    // 날짜 정보 가져오기
    int year = local_time->tm_year + 1900;
    int month = local_time->tm_mon + 1;
    int day = local_time->tm_mday;

    // 현재 날짜 출력
    printf("현재 날짜: %d년 %d월 %d일\n", year, month, day);
    
//
//    // 현재 나이 계산
//    int age = year - birth_year;
//
//    // 생일이 지났는지 체크
//    if (birth_month > local_time->tm_mon + 1 ||
//        (birth_month == local_time->tm_mon + 1 && birth_day > local_time->tm_mday)) {
//        age--;
//    }
//
//    // 결과 출력
//    printf("현재 나이: %d세\n", age);
	
	return 0;
}
