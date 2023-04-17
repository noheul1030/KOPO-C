package 환전소스코드;

import java.util.Scanner;

public class InputClass {
    private Scanner sc = new Scanner(System.in);

    // 1. 원화 입력 메서드
    public int inputFromConsoleWon() {
        System.out.println("원화 입력 : ");
        int inputWon = sc.nextInt();

        if (inputWon < 0) {
            System.out.println("##### 마이너스 값은 입력할 수 없습니다. #####\n");
            return inputFromConsoleWon();
        }
        return inputWon;
    }

    // 2. 바꿀 외화 입력 메서드
    public int inputFromConsoleType() {
        System.out.println("Which money do you want?\n" + "1.USD\n\n" + "2.EUR\n\n" + "3.JPY\n\n" + "0.Exit");

        int inputType = sc.nextInt();

        if (inputType == 0) {
            System.out.println("##### 입력을 종료합니다. #####\n");
            System.exit(0);
        }
        if (!(0 <= inputType && inputType <= 3)) {
            System.out.println("##### 입력 오류 입니다. #####\n");
            return inputFromConsoleType();
        }
        return inputType;
    }
}
