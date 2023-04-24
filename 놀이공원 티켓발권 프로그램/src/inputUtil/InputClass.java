package inputUtil;

import java.util.Scanner;

import output.PrintClass;

public class InputClass {

	private static Scanner scanner = new Scanner(System.in);

	// 1. 티켓 종류 입력 받는 메서드
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

	// 2. 주민등록번호를 입력 받는 메서드
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

	// 3. 주문 갯수를 입력 받는 메서드
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

	// 4. 우대사항을 입력 받는 메서드
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

	// 5. 재시작 여부를 입력받는 메서드
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
////// 예외발생 //////
// 1. 주민등록번호 입력 부분 문자가 들어오면 오류
// 2. int 입력 부분에 String이 들어오면 오류
// 3. 남성이 우대사항 임산부5번 선택하면 오류
