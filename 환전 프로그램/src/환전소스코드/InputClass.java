package ȯ���ҽ��ڵ�;

import java.util.Scanner;

public class InputClass {
    private Scanner sc = new Scanner(System.in);

    // 1. ��ȭ �Է� �޼���
    public int inputFromConsoleWon() {
        System.out.println("��ȭ �Է� : ");
        int inputWon = sc.nextInt();

        if (inputWon < 0) {
            System.out.println("##### ���̳ʽ� ���� �Է��� �� �����ϴ�. #####\n");
            return inputFromConsoleWon();
        }
        return inputWon;
    }

    // 2. �ٲ� ��ȭ �Է� �޼���
    public int inputFromConsoleType() {
        System.out.println("Which money do you want?\n" + "1.USD\n\n" + "2.EUR\n\n" + "3.JPY\n\n" + "0.Exit");

        int inputType = sc.nextInt();

        if (inputType == 0) {
            System.out.println("##### �Է��� �����մϴ�. #####\n");
            System.exit(0);
        }
        if (!(0 <= inputType && inputType <= 3)) {
            System.out.println("##### �Է� ���� �Դϴ�. #####\n");
            return inputFromConsoleType();
        }
        return inputType;
    }
}
