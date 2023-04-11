#include <stdio.h>
#include <time.h>

int main() {
    char resident_Registration_Number[14];  // 주민등록번호를 입력받을 문자열 배열
    printf("주민등록번호를 입력하세요 (예: 970101-1234567): ");
    scanf("%s", resident_Registration_Number);  // 주민등록번호 입력 받기

    // 7번째 숫자 추출
    int century_digit = resident_Registration_Number[7] - '0';

    // 생년월일 추출
    int year, month, day;
    sscanf(resident_Registration_Number, "%2d%2d%2d", &year, &month, &day);

    // 현재 날짜 가져오기
    time_t t = time(NULL);
    struct tm tm = *localtime(&t);
    int current_year = tm.tm_year + 1900;
    int current_month = tm.tm_mon + 1;
    int current_day = tm.tm_mday;

    // 1900년대 또는 2000년대에 따라 연도 조정
    if (century_digit == 1 || century_digit == 2) {
        year += 1900;
    } else if (century_digit == 3 || century_digit == 4) {
        year += 2000;
    }

    // 만 나이 계산
    int age = current_year - year;
    if (current_month < month || (current_month == month && current_day < day)) {
        age--;
    }

    // 결과 출력
    printf("만 나이: %d\n", age);

    return 0;
}

