package InputUtil;

import java.time.LocalDate;
import java.time.Period;

public class AgeCheck {
	
	// 주민등록번호 만 나이 계산
	public static int ageCheck(String JuminNUmber) {
		int age = 0;

		int birthYear = Integer.parseInt(JuminNUmber.substring(0, 2));
		int birthMonth = Integer.parseInt(JuminNUmber.substring(2, 4));
		int birthDay = Integer.parseInt(JuminNUmber.substring(4, 6));

		int index = Integer.parseInt(JuminNUmber.substring(7, 8));

		if (index == 3 || index == 4) {
			birthYear = birthYear + TicketConstants.NEW_GENERATION;
		} else {
			birthYear = birthYear + TicketConstants.OLD_GENERATION;
		}

		LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
		Period agePeriod = Period.between(birthDate, TicketConstants.CURRENT_DATE);

		age = agePeriod.getYears();

		if (birthMonth > TicketConstants.CURRENT_DATE.getMonthValue()
				|| (birthMonth == TicketConstants.CURRENT_DATE.getMonthValue()
						&& birthDay > TicketConstants.CURRENT_DATE.getDayOfMonth())) {
			age--;
		}
		return age;
	}
}
