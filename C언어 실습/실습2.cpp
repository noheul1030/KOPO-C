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
            int bit = num % 2; // 10진수를 2진수로 변환하여 비트 추출
            if (bit == 0) {
                arr1_rock[i][j] = ' '; // 0인 경우 공백(" ")으로 저장
            } else {
                arr1_rock[i][j] = '#'; // 1인 경우 "#"으로 저장
            }
            num /= 2;
        }
    }
    
    
    for (int i = 0; i < n; i++) {
        int num = arr2[i];
        for (int j = 4; j >= 0; j--) {
            int bit = num % 2; // 10진수를 2진수로 변환하여 비트 추출
            if (bit == 0) {
                arr2_rock[i][j] = ' '; // 0인 경우 공백(" ")으로 저장
            } else {
                arr2_rock[i][j] = '#'; // 1인 경우 "#"으로 저장
            }
            num /= 2;
        }
    }

    // 결과 출력
    printf("arr1_rock 배열:\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < 5; j++) {
            printf("%c ", arr1_rock[i][j]);
        }
        printf("\n");
    }
    printf("\n\n\n");
    
    printf("arr2_rock 배열:\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < 5; j++) {
            printf("%c ", arr2_rock[i][j]);
        }
        printf("\n");
    }
	printf("\n\n\n");
	
	
	// arr1_rock 배열과 arr2_rock 배열 합친 결과를 arr3_rock 배열에 저장
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < 5; j++) {
            if (arr1_rock[i][j] == '#' || arr2_rock[i][j] == '#') {
                arr3_rock[i][j] = '#';
            } else {
                arr3_rock[i][j] = ' ';
            }
        }
    }

    // arr3_rock 배열 출력
    printf("arr3_rock 배열:\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < 5; j++) {
            printf("%c ", arr3_rock[i][j]);
        }
        printf("\n");
    }
    
    
    return 0;
}

