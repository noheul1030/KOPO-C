package LOTTEWORLD;

import java.time.LocalDate;
import java.time.Period;

public class TicketCalculator {
	
	// 1. �� ���� ��� �޼���
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

	// 2. ������ ���ÿ� ���� ������ �ʱⰪ ���� �޼���
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

	// 3. ���̿� ���� �׷� ��ȣ ����
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

	// 4. ������ Ƽ�ϰ� ���̸� ����Ͽ� �ݾ��� �����ϴ� �޼���
	public int ticketPrice(int ticketChoice, int ageGroup) {

		// ���ϱ� ����
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

		// �߰��� ����
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

	// 5. ����� Ƽ�ϰ��ݰ� �ֹ� ������ ����ϴ� �޼���
	public int total(int ticketPrice, int buyTicketChoice) {

		return ticketPrice * buyTicketChoice;

	}
}
