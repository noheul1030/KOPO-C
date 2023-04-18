package lotteworld;

import java.util.Scanner;

public class InputClass extends PrintClass {

    private Scanner scanner = new Scanner(System.in);

    // 1. 티켓 종류 입력 받는 메서드
    public int ticketChoice() {
        int ticketChoice = 0;

        while (true) {
            ticketChoicePint();
            ticketChoice = scanner.nextInt();

            if (ticketChoice == 1 || ticketChoice == 2) {
                break;
            }
            errorPrint();
        }
        return ticketChoice;
    }

    // 2. 주민등록번호를 입력 받는 메서드
    public String residentRegistrationNumber() {
        String residentRegistrationNumber = "";

        while (true) {
            residentRegistrationNumberPint();
            residentRegistrationNumber = scanner.next();

            if (residentRegistrationNumber.length() == 14) {
                if (residentRegistrationNumber.substring(6, 7).equals("-")) {
                    break;
                }
            }
            errorPrint();
        }
        return residentRegistrationNumber;
    }

    // 3. 주문 갯수를 입력 받는 메서드
    public int buyTicketChoice() {
        int buyTicketChoice = 0;

        while (true) {
            buyTicketChoicePint();
            buyTicketChoice = scanner.nextInt();

            if (TicketConstant.BUY_MIN_COUNT <= buyTicketChoice && buyTicketChoice <= TicketConstant.BUY_MAX_COUNT) {
                break;
            }
            errorPrint();
        }
        return buyTicketChoice;
    }

    // 4. 우대사항을 입력 받는 메서드
    public int preferentialTreatmentChoice() {
        int preferentialTreatmentChoice = 0;

        while (true) {
            preferentialTreatmentChoicePint();
            preferentialTreatmentChoice = scanner.nextInt();

//			if (!(residentRegistrationNumber.substring(7, 8).equals("1")
//					|| residentRegistrationNumber.substring(7, 8).equals("3"))) {
//				if (preferentialTreatmentChoice == 5) {
//					break;
//				}
//			}

            if (1 <= preferentialTreatmentChoice && preferentialTreatmentChoice <= 5) {
                break;
            }
            errorPrint();
        }
        return preferentialTreatmentChoice;
    }

    // 5. 재시작 여부를 입력받는 메서드
    public int reTry() {
        int reTry = 0;

        while (true) {
            totalRePrint();
            reTry = scanner.nextInt();

            if (reTry == 1 || reTry == 2) {
                break;
            }
            errorPrint();
        }
        return reTry;
    }
}