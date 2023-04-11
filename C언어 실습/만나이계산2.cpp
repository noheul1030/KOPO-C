#include <stdio.h>
#include <time.h>

int main() {
    char resident_Registration_Number[14];  // �ֹε�Ϲ�ȣ�� �Է¹��� ���ڿ� �迭
    printf("�ֹε�Ϲ�ȣ�� �Է��ϼ��� (��: 970101-1234567): ");
    scanf("%s", resident_Registration_Number);  // �ֹε�Ϲ�ȣ �Է� �ޱ�

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

    // ��� ���
    printf("�� ����: %d\n", age);

    return 0;
}

