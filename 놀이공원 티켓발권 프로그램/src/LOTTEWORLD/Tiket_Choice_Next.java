package LOTTEWORLD;

import java.text.DecimalFormat;

public class Tiket_Choice_Next extends Tiket {

	DecimalFormat sd = new DecimalFormat("###,###,###,###");

	// 5. ������ ���ÿ� ���� ������ �ʱⰪ ���� �޼���
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
	
	// 6. ���̿� ���� �׷� ��ȣ ����
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
	
	// 6-1. ������ Ƽ�ϰ� ���̸� ����Ͽ� �ݾ��� �����ϴ� �޼��� 
	public int tiketPrice2(int tiket_Choice, int ageGroup) {

		// ���ϱ� ����
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

		// �߰��� ����
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

//	// 6. ������ Ƽ�ϰ� ���̸� ����Ͽ� �ݾ��� �����ϴ� �޼���
//	public int tiketPrice(int tiket_Choice, int age) {
//
//		int tiketPrice = 0;
//
//		// ���ϱ� ����
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
//		// �߰��� ����
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

	// 7. ����� Ƽ�ϰ��ݰ� �ֹ� ������ ����ϴ� �޼���
	public int total(int tiketPrice, int buyTiket_Choice) {

		return tiketPrice * buyTiket_Choice;

	}

	// 8. Test 6 -> 7 -> 5 ������ ��� ���� �޼���
	public void test() {
//        int tiket_Price = tiketPrice(tiket_Choice(), age());

		int total = total(tiketPrice2(tiket_Choice(), ageGroup(age())), buyTiket_Choice());

		int total_Sale = (int) (total * preferentialTreatment_Sale(preferentialTreatment_Choice()));

		System.out.println("\n������ " + sd.format(total_Sale) + " �� �Դϴ�.");
		System.out.println("�����մϴ�.");
	}

	// 9. Ƽ�� �߱��� ���� / ���� ���� Ȯ�� �޼���
	public void test2() {

		while (true) {
			test();

			int pick = 0;

			System.out.println("\n��� �߱� �Ͻðڽ��ϱ�? \n" + "1. Ƽ�� �߱� \n" + "2. ����");
			pick = scanner.nextInt();

			if (pick == 1) {
				continue;
			} else if (pick == 2) {
				System.out.println("\n***** Ƽ�� �߱��� �����մϴ�. �����մϴ�. *****");
				break;
			}
		}
	}
}
