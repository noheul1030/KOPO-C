package inputUtil;

import java.util.Scanner;

import output.LanguagePrintClass;

public class InputClass {

    private static Scanner scanner = new Scanner(System.in);

    // 0. ��� ���� �޼���
    public static void languageChoice() {
        while (true) {
            System.out.println("�� ������ �ּ���. \n" + "1. KOREAN \n" + "2. ENGLISH ");
            String languageChoice = scanner.next();

            if (InputErrorCheck.languageChoiceCheck(languageChoice)) {
                LanguagePrintClass.choiceLanguage(languageChoice);
                return;
            }
            System.out.println(LanguagePrintClass.getMsg("Print.error"));
        }
    }

    // 1. Ƽ�� ���� �Է� �޴� �޼���
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

    // 2. �ֹε�Ϲ�ȣ�� �Է� �޴� �޼���
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

    // 3. �ֹ� ������ �Է� �޴� �޼���
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

    // 4. �������� �Է� �޴� �޼���
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

    // 5. ����� ���θ� �Է¹޴� �޼���
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
////// ���ܹ߻� //////
// 1. �ֹε�Ϲ�ȣ �Է� �κ� ���ڰ� ������ ����
// 2. int �Է� �κп� String�� ������ ����
// 3. ������ ������ �ӻ��5�� �����ϸ� ����
