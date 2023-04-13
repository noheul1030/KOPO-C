#include <stdio.h>
#include <stdlib.h>
#include <time.h>


// Tiket_Choice_Next 구조체 선언
struct Tiket_Choice_Next {
    // 필요한 멤버 변수 선언
};

// 1. 티켓 종류 입력 받는 함수
int tiket_Choice() {
    printf("발권하실 티켓의 종류를 선택해 주세요. \n"
           "1. 종일권 \n"
           "2. 야간권\n");

    int tiketChoice;
    scanf("%d", &tiketChoice);

    return tiketChoice;
}

// 2. 주민등록번호를 입력 받고 나이를 계산하는 함수
int age() {
    printf("주민등록번호를 입력해 주세요. ( 예시 : 123456-1234567 ) : ");
    char resident_Registration_Number[14];
    scanf("%s", resident_Registration_Number);

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

    return age;
}

// 3. 주문 갯수를 입력 받는 함수

int buyTicket_Choice() {
    int buyTicket;
    printf("구매하실 티켓의 갯수를 입력해주세요. (최대 10개): ");
    scanf("%d", &buyTicket);
    if (buyTicket > 10) {
        printf("티켓의 최대 갯수는 10을 넘지 않습니다.\n");
        // 예외 처리를 원하는 방식으로 구현
    }
    return buyTicket;
}

// 4. 우대사항을 입력 받는 함수
//int preferentialTreatment_Choice();
int preferentialTreatmentChoice() {
    int preferentialTreatment;
    printf("우대사항을 선택해 주세요.\n"
           "1. 없음\n"
           "2. 장애인\n"
           "3. 국가유공자\n"
           "4. 다자녀\n"
           "5. 임산부\n");
    scanf("%d", &preferentialTreatment);

    switch (preferentialTreatment) {
        case 1:
            printf("1. 없음을 선택하셨습니다.\n");
            break;
        case 2:
            printf("2. 장애인을 선택하셨습니다.\n");
            break;
        case 3:
            printf("3. 국가유공자를 선택하셨습니다.\n");
            break;
        case 4:
            printf("4. 다자녀를 선택하셨습니다.\n");
            break;
        case 5:
            printf("5. 임산부를 선택하셨습니다.\n");
            break;
        default:
            printf("잘못된 입력입니다. 다시 선택해주세요.\n");
            // 예외 처리를 원하는 방식으로 구현
    }

    return preferentialTreatment;
}

// 5. 우대사항 선택에 따른 할인율 초기값 지정 함수
double preferentialTreatment_Sale(int preferentialTreatment_Choice) {

	double sale = 0.0;

	if (preferentialTreatment_Choice == 1) {
		sale = 1.0;
	} else if (preferentialTreatment_Choice == 2) {
		sale = 0.5;
	} else if (preferentialTreatment_Choice == 3) {
		sale = 0.5;
	} else if (preferentialTreatment_Choice == 4) {
		sale = 0.7;
	} else if (preferentialTreatment_Choice == 5) {
		sale = 0.5;
	}

	return sale;
}

// 6. 선택한 티켓과 나이를 계산하여 금액을 산출하는 함수
int tiketPrice(int tiket_Choice, int age) {

	int tiketPrice = 0;

	// 종일권 가격
	if (tiket_Choice == 1) {
		if (18 <= age && age < 65) {
			tiketPrice = 59000;
		} else if (13 <= age && age <= 18) {
			tiketPrice = 52000;
		} else if (3 <= age && age <= 12) {
			tiketPrice = 46000;
		} else if (age < 3) {
			tiketPrice = 15000;
		} else if (age >= 65) {
			tiketPrice = 46000;
		}
	}
	// 야간권 가격
	if (tiket_Choice == 2) {
		if (18 <= age && age < 65) {
			tiketPrice = 47000;
		} else if (13 <= age && age <= 18) {
			tiketPrice = 41000;
		} else if (3 <= age && age <= 12) {
			tiketPrice = 35000;
		} else if (age < 3) {
			tiketPrice = 15000;
		} else if (age >= 65) {
			tiketPrice = 35000;
		}
	}
	return tiketPrice;
}

// 7. 산출된 티켓가격과 주문 갯수를 계산하는 함수
int total(int tiketPrice, int buyTiket_Choice) {
    int total = tiketPrice * buyTiket_Choice;
    return total;
}

// 8. Test 6 -> 7 -> 5 순으로 계산 실행 함수
void test() {
	
    int tiket_Price = tiketPrice(tiket_Choice(), age());
	
    int total2 = total(tiket_Price, buyTicket_Choice());
	
    int total_Sale = (int)(total2 * preferentialTreatment_Sale(preferentialTreatmentChoice()));

    printf("가격은 %d 원 입니다.\n", total_Sale);
    printf("감사합니다.\n\n");
}

// 9. 티켓 발권의 지속 / 종료 여부 확인 함수
void test2() {
//	struct Tiket_Choice_Next LotteWorld;
    while(1) {
        test();
        printf("\n계속 발권 하시겠습니까? \n"
               "1. 티켓 발권 \n"
               "2. 종료\n");
        int pick = 0;
        scanf("%d", &pick);
        if(pick == 1) {
            continue;
        } else if(pick == 2) {
            printf("\n티켓 발권을 종료합니다. 감사합니다.\n");
            break;
        }
    }
}


// main() 함수
int main() {
    // Tiket_Choice_Next 인스턴스 생성
//    struct Tiket_Choice_Next LotteWorld;
    // test2() 함수 호출
    test2();
    return 0;
}
