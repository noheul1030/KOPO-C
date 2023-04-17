package LOTTEWORLD;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Tiket extends Tiket_Print{
	static Scanner scanner = new Scanner(System.in);

	// 1. Ƽ�� ���� �Է� �޴� �޼���
	public int tiket_Choice() {
		tiket_Choice_Pint();
		
		int tiketChoice = scanner.nextInt();

		if (tiketChoice == 1 || tiketChoice == 2) {
			return tiketChoice;
		} else {
			error_Print();
			return tiket_Choice();
		}

	}

	// 2. �ֹε�Ϲ�ȣ�� �Է� �ް� ���̸� ����ϴ� �޼���
	public int age() {
		age_Pint();

		String resident_Registration_Number = scanner.next();

		if (resident_Registration_Number.length() == 14) {

			if (!(resident_Registration_Number.substring(6, 7).equals("-"))) {
				error_Print();

				return age();

			} else {

				int birthYear = Integer.parseInt(resident_Registration_Number.substring(0, 2));
				int birthMonth = Integer.parseInt(resident_Registration_Number.substring(2, 4));
				int birthDay = Integer.parseInt(resident_Registration_Number.substring(4, 6));

				int index = Integer.parseInt(resident_Registration_Number.substring(7, 8));

				LocalDate currentDate = LocalDate.now();

				if (index == 3 || index == 4) {
					birthYear = birthYear + 2000;
				} else {
					birthYear = birthYear + 1900;
				}

				LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);

				Period agePeriod = Period.between(birthDate, currentDate);
				int age = agePeriod.getYears();

				if (birthMonth > currentDate.getMonthValue()
						|| (birthMonth == currentDate.getMonthValue() && birthDay > currentDate.getDayOfMonth())) {
					age--;
				}

				return age;
			}

		} else {
			error_Print();

			return age();
		}
	}

	// 3. �ֹ� ������ �Է� �޴� �޼���
	public int buyTiket_Choice() {
		buyTiket_Choice_Pint();

		int MAX_COUNT = 10, MIN_COUNT = 1;
		int buyTiket = scanner.nextInt();

		if (MIN_COUNT <= buyTiket && buyTiket <= MAX_COUNT) {
			return buyTiket;
		} else {
			error_Print();
			return buyTiket_Choice();
		}
	}

	// 4. �������� �Է� �޴� �޼���
	public int preferentialTreatment_Choice() {
		preferentialTreatment_Choice_Pint();

		int preferentialTreatment = scanner.nextInt();
		
		if(1 <= preferentialTreatment && preferentialTreatment <= 5) {
			return preferentialTreatment;			
		}else {
			error_Print();
			return preferentialTreatment_Choice();
		}

	}

}
