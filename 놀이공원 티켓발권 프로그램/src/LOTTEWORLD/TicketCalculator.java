package LOTTEWORLD;

import java.time.LocalDate;
import java.time.Period;

public class TicketCalculator {
	
	// 1. 만 나이 계산 메서드
	public int age(String residentRegistrationNumber) {
		
		int age = 0;

		int birthYear = Integer.parseInt(residentRegistrationNumber.substring(0, 2));
		int birthMonth = Integer.parseInt(residentRegistrationNumber.substring(2, 4));
		int birthDay = Integer.parseInt(residentRegistrationNumber.substring(4, 6));

		int index = Integer.parseInt(residentRegistrationNumber.substring(7, 8));

		LocalDate currentDate = LocalDate.now();

		if (index == 3 || index == 4) {
			birthYear = birthYear + 2000;
		} else {
			birthYear = birthYear + 1900;
		}

		LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);

		Period agePeriod = Period.between(birthDate, currentDate);
		
		age = agePeriod.getYears();

		if (birthMonth > currentDate.getMonthValue()
				|| (birthMonth == currentDate.getMonthValue() && birthDay > currentDate.getDayOfMonth())) {
			age--;
		}
		return age;
	}

	// 2. 우대사항 선택에 따른 할인율 초기값 지정 메서드
	public double preferentialTreatmentSale(int preferentialTreatmentChoice) {

		if (preferentialTreatmentChoice == 1) {
			return 1.0;
		} else if (preferentialTreatmentChoice == 2) {
			return 0.5;
		} else if (preferentialTreatmentChoice == 3) {
			return 0.5;
		} else if (preferentialTreatmentChoice == 4) {
			return 0.7;
		} else if (preferentialTreatmentChoice == 5) {
			return 0.5;
		}

		return 0.0;
	}

	// 3. 나이에 따른 그룹 번호 지정
	public int ageGroup(int age) {

		if (18 <= age && age < 65) {
			return 4;
		} else if (13 <= age && age <= 18) {
			return 3;
		} else if (3 <= age && age <= 12) {
			return 2;
		} else if (age < 3) {
			return 1;
		} else if (age >= 65) {
			return 5;
		}
		return 0;
	}

	// 4. 선택한 티켓과 나이를 계산하여 금액을 산출하는 메서드
	public int ticketPrice(int ticketChoice, int ageGroup) {

		// 종일권 가격
		if (ticketChoice == 1) {
			switch (ageGroup) {
			case 4:
				return 59000;
			case 3:
				return 52000;
			case 2:
				return 46000;
			case 1:
				return 15000;
			case 5:
				return 46000;
			}
		}

		// 야간권 가격
		if (ticketChoice == 2) {
			switch (ageGroup) {
			case 4:
				return 47000;
			case 3:
				return 41000;
			case 2:
				return 35000;
			case 1:
				return 15000;
			case 5:
				return 35000;
			}
		}
		return 0;

	}

	// 5. 산출된 티켓가격과 주문 갯수를 계산하는 메서드
	public int total(int ticketPrice, int buyTicketChoice) {

		return ticketPrice * buyTicketChoice;

	}
}
