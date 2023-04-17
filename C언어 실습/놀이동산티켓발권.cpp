#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>

char error_Print(){
	printf("\n##### 입력 오류 입니다. 다시 입력해주세요 #####\n");
}

// 1. 티켓 종류 입력 받는 함수
int tiket_Choice() {
    printf("발권하실 티켓의 종류를 선택해 주세요. \n"
           "1. 종일권 \n"
           "2. 야간권\n");

    int tiketChoice;
    scanf("%d", &tiketChoice);

    if(tiketChoice == 1 || tiketChoice == 2) {
			return tiketChoice;			
		}else {
			error_Print();
			return tiket_Choice();
		}
}

// 2. 주민등록번호를 입력 받고 나이를 계산하는 함수
int age() {
    printf("\n주민등록번호를 입력해 주세요. ( 예시 : 123456-1234567 ) : ");
    
    char resident_Registration_Number[20];
    scanf("%s", resident_Registration_Number);
    int len = strlen(resident_Registration_Number);
    
	if (len == 14) {
			
			if (resident_Registration_Number[6] != 45) {
				error_Print();
				
				return age();
			} else {
   				int century_digit = resident_Registration_Number[7] - '0';

  				int year, month, day;
  				sscanf(resident_Registration_Number, "%2d%2d%2d", &year, &month, &day);

 				time_t t = time(NULL);
  				struct tm tm = *localtime(&t);
    			int current_year = tm.tm_year + 1900;
    			int current_month = tm.tm_mon + 1;
    			int current_day = tm.tm_mday;

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
	} else {
		error_Print();
			
		return age();
	}
}

// 3. 주문 갯수를 입력 받는 함수
int buyTiket_Choice() {
	const int MAX_COUNT = 10, MIN_COUNT = 1;
    int buyTiket;
    
    printf("\n구매하실 티켓의 갯수를 입력해주세요. (최대 10개): ");
    scanf("%d", &buyTiket);
   
    if (MIN_COUNT <= buyTiket && buyTiket <= MAX_COUNT) {
       return buyTiket;
    }
    else{
    	error_Print();
    	return buyTiket_Choice();
	}
    return buyTiket;
}

// 4. 우대사항을 입력 받는 함수
int preferentialTreatmentChoice() {
    int preferentialTreatment;
    printf("\n우대사항을 선택해 주세요.\n"
           "1. 없음\n"
           "2. 장애인\n"
           "3. 국가유공자\n"
           "4. 다자녀\n"
           "5. 임산부\n");
    scanf("%d", &preferentialTreatment);

    if(1 <= preferentialTreatment && preferentialTreatment <= 5) {
			return preferentialTreatment;			
		}else {
			error_Print();
			return preferentialTreatmentChoice();
		}
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

// 6. 나이에 따른 그룹 번호 지정
int ageGroup(int age){
	if (18 <= age && age < 65) {
			return 4;
		} else if (13 <= age && age <= 18) {
			return 3;
		} else if (3 <= age && age <= 12) {
			return 2;
		} else if (age < 3) {
			return 1;
		} else if (age >= 65) {
			return 5;
		}
		return 0;
}

// 6-1. 선택한 티켓과 나이를 계산하여 금액을 산출하는 메서드 
int tiketPrice2(int ageGroup, int tiket_Choice){
	// 종일권 가격
		if (tiket_Choice == 1) {
			switch (ageGroup) {
			case 4:
				return 59000;
			case 3:
				return 52000;
			case 2:
				return 46000;
			case 1:
				return 15000;
			case 5:
				return 46000;
			}
		}

		// 야간권 가격
		if (tiket_Choice == 2) {
			switch (ageGroup) {
			case 4:
				return 47000;
			case 3:
				return 41000;
			case 2:
				return 35000;
			case 1:
				return 15000;
			case 5:
				return 35000;
			}
		}
		return 0;
}

/*
// 6. 선택한 티켓과 나이를 계산하여 금액을 산출하는 함수
int tiketPrice(int age, int tiket_Choice) {

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
*/

// 7. 산출된 티켓가격과 주문 갯수를 계산하는 함수
int total(int tiketPrice, int buyTiket_Choice) {
    
    return tiketPrice * buyTiket_Choice;
}

// 8. Test 6 -> 7 -> 5 순으로 계산 실행 함수
void test() {
	
    int tiket_Price = tiketPrice2(ageGroup(age()),tiket_Choice());
	
    int total2 = total(tiket_Price, buyTiket_Choice());
	
    int total_Sale = (int)(total2 * preferentialTreatment_Sale(preferentialTreatmentChoice()));

    printf("\n가격은 %d 원 입니다.\n", total_Sale);
    printf("감사합니다.\n");
}

// 9. 티켓 발권의 지속 / 종료 여부 확인 함수
void test2() {

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
 
    test2();
    return 0;
}
