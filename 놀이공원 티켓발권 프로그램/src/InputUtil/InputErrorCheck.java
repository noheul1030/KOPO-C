package InputUtil;

public class InputErrorCheck {

	// 1. Ƽ�� ���� �Է� üũ
	public static boolean ticketChoiceCheck(int value) {
		return value == TicketConstants.CHOICE_NUMBER_ONE || value == TicketConstants.CHOICE_NUMBER_TWO;
	}

	// 2. �ֹε�� ��ȣ ����/ ������ ��ġ üũ
	public static boolean residentRegistrationNumberCheck(String value) {
		if (value.length() != 14) {
			return false;
		}
		if (!(value.substring(6, 7).equals("-"))) {
			return false;
		}
		return true;
	}

	// 3. ���� �ּ�/�ִ� ���� üũ
	public static boolean buyTicketChoiceCheck(int value) {
		return TicketConstants.BUY_MIN_COUNT <= value && value <= TicketConstants.BUY_MAX_COUNT;
	}

	// 4. ������� ���� üũ
	public static boolean preferentialTreatmentChoiceCheck(int value) {
		return 1 <= value && value <= 5;
	}

	// 5. ����� ���� üũ
	public static boolean reTryCheck(int value) {
		return value == TicketConstants.CHOICE_NUMBER_ONE || value == TicketConstants.CHOICE_NUMBER_TWO;
	}
}
