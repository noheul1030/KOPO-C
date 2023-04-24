package inputUtil;

import java.util.Scanner;

import output.PrintClass;

public class InputClass {

	private static Scanner scanner = new Scanner(System.in);

	// 1. Ƽ�� ���� �Է� �޴� �޼���
	public int ticketChoice() {
		while (true) {
			PrintClass.ticketChoicePrint();
			int ticketChoice = scanner.nextInt();

			if (InputErrorCheck.ticketChoiceCheck(ticketChoice)) {
				return ticketChoice;
			}
			PrintClass.errorPrint();
		}
	}

	// 2. �ֹε�Ϲ�ȣ�� �Է� �޴� �޼���
	public String residentRegistrationNumber() {
		while (true) {
			PrintClass.residentRegistrationNumberPrint();
			String residentRegistrationNumber = scanner.next();

			if (InputErrorCheck.residentRegistrationNumberCheck(residentRegistrationNumber)) {
				return residentRegistrationNumber;
			}
			PrintClass.errorPrint();
		}
	}

	// 3. �ֹ� ������ �Է� �޴� �޼���
	public int buyTicketChoice() {
		while (true) {
			PrintClass.buyTicketChoicePrint();
			int buyTicketChoice = scanner.nextInt();

			if (InputErrorCheck.buyTicketChoiceCheck(buyTicketChoice)) {
				return buyTicketChoice;
			}
			PrintClass.errorPrint();
		}
	}

	// 4. �������� �Է� �޴� �޼���
	public int preferentialTreatmentChoice() {
		while (true) {
			PrintClass.preferentialTreatmentChoicePrint();
			int preferentialTreatmentChoice = scanner.nextInt();

			if (InputErrorCheck.preferentialTreatmentChoiceCheck(preferentialTreatmentChoice)) {
				return preferentialTreatmentChoice;
			}
			PrintClass.errorPrint();
		}
	}

	// 5. ����� ���θ� �Է¹޴� �޼���
	public int reTry() {
		while (true) {
			PrintClass.totalRePrint();
			int reTry = scanner.nextInt();

			if (InputErrorCheck.reTryCheck(reTry)) {
				return reTry;
			}
			PrintClass.errorPrint();
		}
	}
}
////// ���ܹ߻� //////
// 1. �ֹε�Ϲ�ȣ �Է� �κ� ���ڰ� ������ ����
// 2. int �Է� �κп� String�� ������ ����
// 3. ������ ������ �ӻ��5�� �����ϸ� ����
