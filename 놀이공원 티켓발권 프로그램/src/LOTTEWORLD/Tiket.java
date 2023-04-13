package LOTTEWORLD;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Tiket {
	static Scanner scanner = new Scanner(System.in);

	// 1. 티켓 종류 입력 받는 메서드
	public int tiket_Choice() {
		System.out.println("발권하실 티켓의 종류를 선택해 주세요. \n"
				+ "1. 종일권 \n"
				+ "2. 야간권");

		int tiketChoice = scanner.nextInt();

		return tiketChoice;
	}

	// 2. 주민등록번호를 입력 받고 나이를 계산하는 메서드
	public int age() {
		System.out.println("주민등록번호를 입력해 주세요. ( 예시 : 123456-1234567 ) : ");

		String resident_Registration_Number = scanner.next();

		// 생년월일 정보 추출
		int birthYear = Integer.parseInt(resident_Registration_Number.substring(0, 2));
		int birthMonth = Integer.parseInt(resident_Registration_Number.substring(2, 4));
		int birthDay = Integer.parseInt(resident_Registration_Number.substring(4, 6));
		
		int index = Integer.parseInt(resident_Registration_Number.substring(7, 8));

		// 현재 날짜 정보 추출
		LocalDate currentDate = LocalDate.now();

		// 생년월일 정보를 LocalDate 객체로 변환
		if(index == 3 || index == 4) {
			birthYear = birthYear+2000;
		}else {
			birthYear = birthYear+1900;
		}
		
		LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);

		// 현재 날짜와 생년월일로 나이 계산
		Period agePeriod = Period.between(birthDate, currentDate);
		int age = agePeriod.getYears();

		// 생년월일이 지났는지 체크하여 나이 조정
		if (birthMonth > currentDate.getMonthValue()
				|| (birthMonth == currentDate.getMonthValue() && birthDay > currentDate.getDayOfMonth())) {
			age--;
		}

		return age;
	}

	// 3. 주문 갯수를 입력 받는 메서드
	public int buyTiket_Choice() {
		System.out.println("구매하실 티켓의 갯수를 입력해주세요. (최대 10개): ");
		int buyTiket = scanner.nextInt();
		try {
			if(buyTiket> 10) {
				throw new Exception("티켓의 최대 갯수는 10을 넘지 않습니다.");
			}
		} catch (Exception e) {
			
		}

		return buyTiket;
	}

	// 4. 우대사항을 입력 받는 메서드
	public int preferentialTreatment_Choice() {
		System.out.println("우대사항을 선택해 주세요. \n"
				+ "1. 없음 \n"
				+ "2. 장애인 \n"
				+ "3. 국가유공자 \n"
				+ "4. 다자녀 \n"
				+ "5. 임산부");

		int preferentialTreatment = scanner.nextInt();
		
		switch(preferentialTreatment) {
			case 1: 
				System.out.println("1. 없음을 선택하셨습니다.\n");
				break;
			case 2:
				System.out.println("2. 장애인을 선택하셨습니다.\n");
				break;
			case 3:
				System.out.println("3. 국가유공자를 선택하셨습니다.\n");
				break;
			case 4:
				System.out.println("4. 다자녀를 선택하셨습니다.\n");
				break;
			case 5:
				System.out.println("5. 임산부를 선택하셨습니다.\n");
				break;
		}

		return preferentialTreatment;
	}

}
