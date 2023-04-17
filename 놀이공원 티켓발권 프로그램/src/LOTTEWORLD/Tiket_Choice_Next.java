package LOTTEWORLD;

import java.text.DecimalFormat;

public class Tiket_Choice_Next extends Tiket {

	DecimalFormat sd = new DecimalFormat("###,###,###,###");

	// 5. 우대사항 선택에 따른 할인율 초기값 지정 메서드
	public double preferentialTreatment_Sale(int preferentialTreatment_Choice) {

		double sale = 0.0;

		if (preferentialTreatment_Choice == 1) {
			sale = 1.0;
		} else if (preferentialTreatment_Choice == 2) {
			sale = 0.5;
		} else if (preferentialTreatment_Choice == 3) {
			sale = 0.5;
		} else if (preferentialTreatment_Choice == 4) {
			sale = 0.7;
		} else if (preferentialTreatment_Choice == 5) {
			sale = 0.5;
		}

		return sale;
	}
	
	// 6. 나이에 따른 그룹 번호 지정
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
	
	// 6-1. 선택한 티켓과 나이를 계산하여 금액을 산출하는 메서드 
	public int tiketPrice2(int tiket_Choice, int ageGroup) {

		// 종일권 가격
		if (tiket_Choice == 1) {
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
		if (tiket_Choice == 2) {
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

//	// 6. 선택한 티켓과 나이를 계산하여 금액을 산출하는 메서드
//	public int tiketPrice(int tiket_Choice, int age) {
//
//		int tiketPrice = 0;
//
//		// 종일권 가격
//		if (tiket_Choice == 1) {
//			if (18 <= age && age < 65) {
//				tiketPrice = 59000;
//			} else if (13 <= age && age <= 18) {
//				tiketPrice = 52000;
//			} else if (3 <= age && age <= 12) {
//				tiketPrice = 46000;
//			} else if (age < 3) {
//				tiketPrice = 15000;
//			} else if (age >= 65) {
//				tiketPrice = 46000;
//			}
//		}
//		// 야간권 가격
//		if (tiket_Choice == 2) {
//			if (18 <= age && age < 65) {
//				tiketPrice = 47000;
//			} else if (13 <= age && age <= 18) {
//				tiketPrice = 41000;
//			} else if (3 <= age && age <= 12) {
//				tiketPrice = 35000;
//			} else if (age < 3) {
//				tiketPrice = 15000;
//			} else if (age >= 65) {
//				tiketPrice = 35000;
//			}
//		}
//		return tiketPrice;
//	}

	// 7. 산출된 티켓가격과 주문 갯수를 계산하는 메서드
	public int total(int tiketPrice, int buyTiket_Choice) {

		return tiketPrice * buyTiket_Choice;

	}

	// 8. Test 6 -> 7 -> 5 순으로 계산 실행 메서드
	public void test() {
//        int tiket_Price = tiketPrice(tiket_Choice(), age());

		int total = total(tiketPrice2(tiket_Choice(), ageGroup(age())), buyTiket_Choice());

		int total_Sale = (int) (total * preferentialTreatment_Sale(preferentialTreatment_Choice()));

		System.out.println("\n가격은 " + sd.format(total_Sale) + " 원 입니다.");
		System.out.println("감사합니다.");
	}

	// 9. 티켓 발권의 지속 / 종료 여부 확인 메서드
	public void test2() {

		while (true) {
			test();

			int pick = 0;

			System.out.println("\n계속 발권 하시겠습니까? \n" + "1. 티켓 발권 \n" + "2. 종료");
			pick = scanner.nextInt();

			if (pick == 1) {
				continue;
			} else if (pick == 2) {
				System.out.println("\n***** 티켓 발권을 종료합니다. 감사합니다. *****");
				break;
			}
		}
	}
}
