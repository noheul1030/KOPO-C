#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>

char error_Print(){
	printf("\n##### �Է� ���� �Դϴ�. �ٽ� �Է����ּ��� #####\n");
}

// 1. Ƽ�� ���� �Է� �޴� �Լ�
int tiket_Choice() {
    printf("�߱��Ͻ� Ƽ���� ������ ������ �ּ���. \n"
           "1. ���ϱ� \n"
           "2. �߰���\n");

    int tiketChoice;
    scanf("%d", &tiketChoice);

    if(tiketChoice == 1 || tiketChoice == 2) {
			return tiketChoice;			
		}else {
			error_Print();
			return tiket_Choice();
		}
}

// 2. �ֹε�Ϲ�ȣ�� �Է� �ް� ���̸� ����ϴ� �Լ�
int age() {
    printf("\n�ֹε�Ϲ�ȣ�� �Է��� �ּ���. ( ���� : 123456-1234567 ) : ");
    
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

 				// �� ���� ���
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

// 3. �ֹ� ������ �Է� �޴� �Լ�
int buyTiket_Choice() {
	const int MAX_COUNT = 10, MIN_COUNT = 1;
    int buyTiket;
    
    printf("\n�����Ͻ� Ƽ���� ������ �Է����ּ���. (�ִ� 10��): ");
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

// 4. �������� �Է� �޴� �Լ�
int preferentialTreatmentChoice() {
    int preferentialTreatment;
    printf("\n�������� ������ �ּ���.\n"
           "1. ����\n"
           "2. �����\n"
           "3. ����������\n"
           "4. ���ڳ�\n"
           "5. �ӻ��\n");
    scanf("%d", &preferentialTreatment);

    if(1 <= preferentialTreatment && preferentialTreatment <= 5) {
			return preferentialTreatment;			
		}else {
			error_Print();
			return preferentialTreatmentChoice();
		}
}

// 5. ������ ���ÿ� ���� ������ �ʱⰪ ���� �Լ�
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

// 6. ���̿� ���� �׷� ��ȣ ����
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

// 6-1. ������ Ƽ�ϰ� ���̸� ����Ͽ� �ݾ��� �����ϴ� �޼��� 
int tiketPrice2(int ageGroup, int tiket_Choice){
	// ���ϱ� ����
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

		// �߰��� ����
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
// 6. ������ Ƽ�ϰ� ���̸� ����Ͽ� �ݾ��� �����ϴ� �Լ�
int tiketPrice(int age, int tiket_Choice) {

	int tiketPrice = 0;

	// ���ϱ� ����
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
	// �߰��� ����
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

// 7. ����� Ƽ�ϰ��ݰ� �ֹ� ������ ����ϴ� �Լ�
int total(int tiketPrice, int buyTiket_Choice) {
    
    return tiketPrice * buyTiket_Choice;
}

// 8. Test 6 -> 7 -> 5 ������ ��� ���� �Լ�
void test() {
	
    int tiket_Price = tiketPrice2(ageGroup(age()),tiket_Choice());
	
    int total2 = total(tiket_Price, buyTiket_Choice());
	
    int total_Sale = (int)(total2 * preferentialTreatment_Sale(preferentialTreatmentChoice()));

    printf("\n������ %d �� �Դϴ�.\n", total_Sale);
    printf("�����մϴ�.\n");
}

// 9. Ƽ�� �߱��� ���� / ���� ���� Ȯ�� �Լ�
void test2() {

    while(1) {
        test();
        printf("\n��� �߱� �Ͻðڽ��ϱ�? \n"
               "1. Ƽ�� �߱� \n"
               "2. ����\n");
        int pick = 0;
        scanf("%d", &pick);
        if(pick == 1) {
            continue;
        } else if(pick == 2) {
            printf("\nƼ�� �߱��� �����մϴ�. �����մϴ�.\n");
            break;
        }
    }
}


// main() �Լ�
int main() {
 
    test2();
    return 0;
}
