#include <stdio.h>

int main() {
    int i;
    printf("�迭 ũ�⸦ �Է��ϼ���: ");
    scanf("%d", &i);

    int arr[i][i];
    
    int num = 1; 
    int row_start = 0; // �� ����
    int row_end = i-1; // �� ��
    int col_start = 0; // �� ����
    int col_end = i-1; // �� ��

    while (num <= i*i) {
        // ���ʿ��� ������
        for (int j = col_start; j <= col_end; j++) {
            arr[row_start][j] = num++;
        }
        row_start++; // ���� ������ �̵�

        // ������ �Ʒ���
        for (int j = row_start; j <= row_end; j++) {
            arr[j][col_end] = num++;
        }
        col_end--; // ���� ���� �̵�

        // �����ʿ��� ����
        for (int j = col_end; j >= col_start; j--) {
            arr[row_end][j] = num++;
        }
        row_end--; // ���� ������ �̵�

        // �Ʒ����� ����
        for (int j = row_end; j >= row_start; j--) {
            arr[j][col_start] = num++;
        }
        col_start++; // ���� ���� �̵�
	}
        
    for (int row = 0; row < i; row++) {
        for (int col = 0; col < i; col++) {
            printf("%3d ", arr[row][col]);
        }
        printf("\n");
    }

    return 0;
}

