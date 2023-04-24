package InputUtil;

public class InputErrorCheck {

	// 1. 티켓 종류 입력 체크
	public static boolean ticketChoiceCheck(int value) {
		return value == TicketConstants.CHOICE_NUMBER_ONE || value == TicketConstants.CHOICE_NUMBER_TWO;
	}

	// 2. 주민등록 번호 길이/ 하이퍼 위치 체크
	public static boolean residentRegistrationNumberCheck(String value) {
		if (value.length() != 14) {
			return false;
		}
		if (!(value.substring(6, 7).equals("-"))) {
			return false;
		}
		return true;
	}

	// 3. 구매 최소/최대 갯수 체크
	public static boolean buyTicketChoiceCheck(int value) {
		return TicketConstants.BUY_MIN_COUNT <= value && value <= TicketConstants.BUY_MAX_COUNT;
	}

	// 4. 우대할인 선택 체크
	public static boolean preferentialTreatmentChoiceCheck(int value) {
		return 1 <= value && value <= 5;
	}

	// 5. 재시작 여부 체크
	public static boolean reTryCheck(int value) {
		return value == TicketConstants.CHOICE_NUMBER_ONE || value == TicketConstants.CHOICE_NUMBER_TWO;
	}
}
