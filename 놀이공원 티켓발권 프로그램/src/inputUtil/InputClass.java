package inputUtil;

import java.util.Scanner;

import output.LanguagePrintClass;

public class InputClass {

    private static Scanner scanner = new Scanner(System.in);

    // 0. 언어 선택 메서드
    public static void languageChoice() {
        while (true) {
            System.out.println("언어를 선택해 주세요. \n" + "1. KOREAN \n" + "2. ENGLISH ");
            String languageChoice = scanner.next();

            if (InputErrorCheck.languageChoiceCheck(languageChoice)) {
                LanguagePrintClass.choiceLanguage(languageChoice);
                return;
            }
            System.out.println(LanguagePrintClass.getMsg("Print.error"));
        }
    }

    // 1. 티켓 종류 입력 받는 메서드
    public int ticketChoice() {
        while (true) {
            System.out.println(LanguagePrintClass.getMsg("Print.type"));
            int ticketChoice = scanner.nextInt();

            if (InputErrorCheck.ticketChoiceCheck(ticketChoice)) {
                return ticketChoice;
            }
            System.out.println(LanguagePrintClass.getMsg("Print.error"));
        }
    }

    // 2. 주민등록번호를 입력 받는 메서드
    public String residentRegistrationNumber() {
        while (true) {
            System.out.println(LanguagePrintClass.getMsg("Print.residentRegistrationNumber"));
            String residentRegistrationNumber = scanner.next();

            if (InputErrorCheck.residentRegistrationNumberCheck(residentRegistrationNumber)) {
                return residentRegistrationNumber;
            }
            System.out.println(LanguagePrintClass.getMsg("Print.error"));
        }
    }

    // 3. 주문 갯수를 입력 받는 메서드
    public int buyTicketChoice() {
        while (true) {
            System.out.println(LanguagePrintClass.getMsg("Print.buyTicket"));
            int buyTicketChoice = scanner.nextInt();

            if (InputErrorCheck.buyTicketChoiceCheck(buyTicketChoice)) {
                return buyTicketChoice;
            }
            System.out.println(LanguagePrintClass.getMsg("Print.error"));
        }
    }

    // 4. 우대사항을 입력 받는 메서드
    public int preferentialTreatmentChoice() {
        while (true) {
            System.out.println(LanguagePrintClass.getMsg("Print.preferentialTreatment"));
            int preferentialTreatmentChoice = scanner.nextInt();

            if (InputErrorCheck.preferentialTreatmentChoiceCheck(preferentialTreatmentChoice)) {
                return preferentialTreatmentChoice;
            }
            System.out.println(LanguagePrintClass.getMsg("Print.error"));
        }
    }

    // 5. 재시작 여부를 입력받는 메서드
    public int reTry() {
        while (true) {
            System.out.println(LanguagePrintClass.getMsg("Print.retry"));
            int reTry = scanner.nextInt();

            if (InputErrorCheck.reTryCheck(reTry)) {
                return reTry;
            }
            System.out.println(LanguagePrintClass.getMsg("Print.error"));
        }
    }
}
////// 예외발생 //////
// 1. 주민등록번호 입력 부분 문자가 들어오면 오류
// 2. int 입력 부분에 String이 들어오면 오류
// 3. 남성이 우대사항 임산부5번 선택하면 오류
