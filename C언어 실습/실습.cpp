#include <stdio.h>

int main() {
    int i;
    printf("배열 크기를 입력하세요: ");
    scanf("%d", &i);

    int arr[i][i];
    
    int num = 1; 
    int row_start = 0; // 행 시작
    int row_end = i-1; // 행 끝
    int col_start = 0; // 열 시작
    int col_end = i-1; // 열 끝

    while (num <= i*i) {
        // 왼쪽에서 오른쪽
        for (int j = col_start; j <= col_end; j++) {
            arr[row_start][j] = num++;
        }
        row_start++; // 다음 행으로 이동

        // 위에서 아래로
        for (int j = row_start; j <= row_end; j++) {
            arr[j][col_end] = num++;
        }
        col_end--; // 다음 열로 이동

        // 오른쪽에서 왼쪽
        for (int j = col_end; j >= col_start; j--) {
            arr[row_end][j] = num++;
        }
        row_end--; // 다음 행으로 이동

        // 아래에서 위로
        for (int j = row_end; j >= row_start; j--) {
            arr[j][col_start] = num++;
        }
        col_start++; // 다음 열로 이동
	}
        
    for (int row = 0; row < i; row++) {
        for (int col = 0; col < i; col++) {
            printf("%3d ", arr[row][col]);
        }
        printf("\n");
    }

    return 0;
}

