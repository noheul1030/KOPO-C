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
//	printf("-�� ������ �ֹι�ȣ�� �Է��ϼ��� : "); 
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
//	printf("���ڸ� �� �ڸ��� �ڸ� ���: ");
//    for (int i = 0; i < length; i++) {
//        printf("%d ", change_Number[i]);
//    }
//    printf("\n");

	
	
	
	// ���� �ð� ���ϱ�
    time_t now = time(NULL);
    struct tm *local_time = localtime(&now);

    // ��¥ ���� ��������
    int year = local_time->tm_year + 1900;
    int month = local_time->tm_mon + 1;
    int day = local_time->tm_mday;

    // ���� ��¥ ���
    printf("���� ��¥: %d�� %d�� %d��\n", year, month, day);
    
//
//    // ���� ���� ���
//    int age = year - birth_year;
//
//    // ������ �������� üũ
//    if (birth_month > local_time->tm_mon + 1 ||
//        (birth_month == local_time->tm_mon + 1 && birth_day > local_time->tm_mday)) {
//        age--;
//    }
//
//    // ��� ���
//    printf("���� ����: %d��\n", age);
	
	return 0;
}
