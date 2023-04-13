#include <stdio.h>
#include <stdlib.h>
#include <time.h>


// Tiket_Choice_Next ����ü ����
struct Tiket_Choice_Next {
    // �ʿ��� ��� ���� ����
};

// 1. Ƽ�� ���� �Է� �޴� �Լ�
int tiket_Choice() {
    printf("�߱��Ͻ� Ƽ���� ������ ������ �ּ���. \n"
           "1. ���ϱ� \n"
           "2. �߰���\n");

    int tiketChoice;
    scanf("%d", &tiketChoice);

    return tiketChoice;
}

// 2. �ֹε�Ϲ�ȣ�� �Է� �ް� ���̸� ����ϴ� �Լ�
int age() {
    printf("�ֹε�Ϲ�ȣ�� �Է��� �ּ���. ( ���� : 123456-1234567 ) : ");
    char resident_Registration_Number[14];
    scanf("%s", resident_Registration_Number);

    // 7��° ���� ����
    int century_digit = resident_Registration_Number[7] - '0';

    // ������� ����
    int year, month, day;
    sscanf(resident_Registration_Number, "%2d%2d%2d", &year, &month, &day);

    // ���� ��¥ ��������
    time_t t = time(NULL);
    struct tm tm = *localtime(&t);
    int current_year = tm.tm_year + 1900;
    int current_month = tm.tm_mon + 1;
    int current_day = tm.tm_mday;

    // 1900��� �Ǵ� 2000��뿡 ���� ���� ����
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

// 3. �ֹ� ������ �Է� �޴� �Լ�

int buyTicket_Choice() {
    int buyTicket;
    printf("�����Ͻ� Ƽ���� ������ �Է����ּ���. (�ִ� 10��): ");
    scanf("%d", &buyTicket);
    if (buyTicket > 10) {
        printf("Ƽ���� �ִ� ������ 10�� ���� �ʽ��ϴ�.\n");
        // ���� ó���� ���ϴ� ������� ����
    }
    return buyTicket;
}

// 4. �������� �Է� �޴� �Լ�
//int preferentialTreatment_Choice();
int preferentialTreatmentChoice() {
    int preferentialTreatment;
    printf("�������� ������ �ּ���.\n"
           "1. ����\n"
           "2. �����\n"
           "3. ����������\n"
           "4. ���ڳ�\n"
           "5. �ӻ��\n");
    scanf("%d", &preferentialTreatment);

    switch (preferentialTreatment) {
        case 1:
            printf("1. ������ �����ϼ̽��ϴ�.\n");
            break;
        case 2:
            printf("2. ������� �����ϼ̽��ϴ�.\n");
            break;
        case 3:
            printf("3. ���������ڸ� �����ϼ̽��ϴ�.\n");
            break;
        case 4:
            printf("4. ���ڳฦ �����ϼ̽��ϴ�.\n");
            break;
        case 5:
            printf("5. �ӻ�θ� �����ϼ̽��ϴ�.\n");
            break;
        default:
            printf("�߸��� �Է��Դϴ�. �ٽ� �������ּ���.\n");
            // ���� ó���� ���ϴ� ������� ����
    }

    return preferentialTreatment;
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

// 6. ������ Ƽ�ϰ� ���̸� ����Ͽ� �ݾ��� �����ϴ� �Լ�
int tiketPrice(int tiket_Choice, int age) {

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

// 7. ����� Ƽ�ϰ��ݰ� �ֹ� ������ ����ϴ� �Լ�
int total(int tiketPrice, int buyTiket_Choice) {
    int total = tiketPrice * buyTiket_Choice;
    return total;
}

// 8. Test 6 -> 7 -> 5 ������ ��� ���� �Լ�
void test() {
	
    int tiket_Price = tiketPrice(tiket_Choice(), age());
	
    int total2 = total(tiket_Price, buyTicket_Choice());
	
    int total_Sale = (int)(total2 * preferentialTreatment_Sale(preferentialTreatmentChoice()));

    printf("������ %d �� �Դϴ�.\n", total_Sale);
    printf("�����մϴ�.\n\n");
}

// 9. Ƽ�� �߱��� ���� / ���� ���� Ȯ�� �Լ�
void test2() {
//	struct Tiket_Choice_Next LotteWorld;
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
    // Tiket_Choice_Next �ν��Ͻ� ����
//    struct Tiket_Choice_Next LotteWorld;
    // test2() �Լ� ȣ��
    test2();
    return 0;
}
