package LOTTEWORLD;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Tiket {
	static Scanner scanner = new Scanner(System.in);

	// 1. Ƽ�� ���� �Է� �޴� �޼���
	public int tiket_Choice() {
		System.out.println("�߱��Ͻ� Ƽ���� ������ ������ �ּ���. \n"
				+ "1. ���ϱ� \n"
				+ "2. �߰���");

		int tiketChoice = scanner.nextInt();

		return tiketChoice;
	}

	// 2. �ֹε�Ϲ�ȣ�� �Է� �ް� ���̸� ����ϴ� �޼���
	public int age() {
		System.out.println("�ֹε�Ϲ�ȣ�� �Է��� �ּ���. ( ���� : 123456-1234567 ) : ");

		String resident_Registration_Number = scanner.next();

		// ������� ���� ����
		int birthYear = Integer.parseInt(resident_Registration_Number.substring(0, 2));
		int birthMonth = Integer.parseInt(resident_Registration_Number.substring(2, 4));
		int birthDay = Integer.parseInt(resident_Registration_Number.substring(4, 6));
		
		int index = Integer.parseInt(resident_Registration_Number.substring(7, 8));

		// ���� ��¥ ���� ����
		LocalDate currentDate = LocalDate.now();

		// ������� ������ LocalDate ��ü�� ��ȯ
		if(index == 3 || index == 4) {
			birthYear = birthYear+2000;
		}else {
			birthYear = birthYear+1900;
		}
		
		LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);

		// ���� ��¥�� ������Ϸ� ���� ���
		Period agePeriod = Period.between(birthDate, currentDate);
		int age = agePeriod.getYears();

		// ��������� �������� üũ�Ͽ� ���� ����
		if (birthMonth > currentDate.getMonthValue()
				|| (birthMonth == currentDate.getMonthValue() && birthDay > currentDate.getDayOfMonth())) {
			age--;
		}

		return age;
	}

	// 3. �ֹ� ������ �Է� �޴� �޼���
	public int buyTiket_Choice() {
		System.out.println("�����Ͻ� Ƽ���� ������ �Է����ּ���. (�ִ� 10��): ");
		int buyTiket = scanner.nextInt();
		try {
			if(buyTiket> 10) {
				throw new Exception("Ƽ���� �ִ� ������ 10�� ���� �ʽ��ϴ�.");
			}
		} catch (Exception e) {
			
		}

		return buyTiket;
	}

	// 4. �������� �Է� �޴� �޼���
	public int preferentialTreatment_Choice() {
		System.out.println("�������� ������ �ּ���. \n"
				+ "1. ���� \n"
				+ "2. ����� \n"
				+ "3. ���������� \n"
				+ "4. ���ڳ� \n"
				+ "5. �ӻ��");

		int preferentialTreatment = scanner.nextInt();
		
		switch(preferentialTreatment) {
			case 1: 
				System.out.println("1. ������ �����ϼ̽��ϴ�.\n");
				break;
			case 2:
				System.out.println("2. ������� �����ϼ̽��ϴ�.\n");
				break;
			case 3:
				System.out.println("3. ���������ڸ� �����ϼ̽��ϴ�.\n");
				break;
			case 4:
				System.out.println("4. ���ڳฦ �����ϼ̽��ϴ�.\n");
				break;
			case 5:
				System.out.println("5. �ӻ�θ� �����ϼ̽��ϴ�.\n");
				break;
		}

		return preferentialTreatment;
	}

}
