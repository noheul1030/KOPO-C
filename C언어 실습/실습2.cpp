#include <stdio.h>

int main() {
    int n = 5;
    int arr1[] = {9, 20, 28, 18, 11};
    int arr2[] = {30,1,21,17,28};
    int arr1_rock[5][5];
    int arr2_rock[5][5];
    int arr3_rock[5][5];

    for (int i = 0; i < n; i++) {
        int num = arr1[i];
        for (int j = 4; j >= 0; j--) {
            int bit = num % 2; // 10������ 2������ ��ȯ�Ͽ� ��Ʈ ����
            if (bit == 0) {
                arr1_rock[i][j] = ' '; // 0�� ��� ����(" ")���� ����
            } else {
                arr1_rock[i][j] = '#'; // 1�� ��� "#"���� ����
            }
            num /= 2;
        }
    }
    
    
    for (int i = 0; i < n; i++) {
        int num = arr2[i];
        for (int j = 4; j >= 0; j--) {
            int bit = num % 2; // 10������ 2������ ��ȯ�Ͽ� ��Ʈ ����
            if (bit == 0) {
                arr2_rock[i][j] = ' '; // 0�� ��� ����(" ")���� ����
            } else {
                arr2_rock[i][j] = '#'; // 1�� ��� "#"���� ����
            }
            num /= 2;
        }
    }

    // ��� ���
    printf("arr1_rock �迭:\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < 5; j++) {
            printf("%c ", arr1_rock[i][j]);
        }
        printf("\n");
    }
    printf("\n\n\n");
    
    printf("arr2_rock �迭:\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < 5; j++) {
            printf("%c ", arr2_rock[i][j]);
        }
        printf("\n");
    }
	printf("\n\n\n");
	
	
	// arr1_rock �迭�� arr2_rock �迭 ��ģ ����� arr3_rock �迭�� ����
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < 5; j++) {
            if (arr1_rock[i][j] == '#' || arr2_rock[i][j] == '#') {
                arr3_rock[i][j] = '#';
            } else {
                arr3_rock[i][j] = ' ';
            }
        }
    }

    // arr3_rock �迭 ���
    printf("arr3_rock �迭:\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < 5; j++) {
            printf("%c ", arr3_rock[i][j]);
        }
        printf("\n");
    }
    
    
    return 0;
}

