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
	
	// 6. ������ Ƽ�ϰ� ���̸� ����Ͽ� �ݾ��� �����ϴ� �޼���
	public int tiketPrice(int tiket_Choice, int age) {

		int tiketPrice = 0;

		// ���ϱ� ����
		if (tiket_Choice == 1) {
			if (18 <= age && age < 65) {
				tiketPrice = 59000;
			} else if (13 <= age && age <= 18) {
				tiketPrice = 52000;
			} else if (3 <= age && age <= 12) {
				tiketPrice = 46000;
			} else if (age < 3) {
				tiketPrice = 15000;
			} else if (age >= 65) {
				tiketPrice = 46000;
			}
		}
		// �߰��� ����
		if (tiket_Choice == 2) {
			if (18 <= age && age < 65) {
				tiketPrice = 47000;
			} else if (13 <= age && age <= 18) {
				tiketPrice = 41000;
			} else if (3 <= age && age <= 12) {
				tiketPrice = 35000;
			} else if (age < 3) {
				tiketPrice = 15000;
			} else if (age >= 65) {
				tiketPrice = 35000;
			}
		}
		return tiketPrice;
	}
	
	// 7. ����� Ƽ�ϰ��ݰ� �ֹ� ������ ����ϴ� �޼���
	public int total(int tiketPrice, int buyTiket_Choice) {
		int total = tiketPrice * buyTiket_Choice;
		return total;
		
	}
	
	// 8. Test 6 -> 7 -> 5 ������ ��� ���� �޼���
	public void test() {
		int tiket_Price = tiketPrice(tiket_Choice(),age());
		
		int total = total(tiket_Price, buyTiket_Choice());
		
		int total_Sale = (int)(total * preferentialTreatment_Sale(preferentialTreatment_Choice()));
		
		System.out.println("������ "+ sd.format(total_Sale)+ " �� �Դϴ�.");
		System.out.println("�����մϴ�.\n");
	}
	
	// 9. Ƽ�� �߱��� ���� / ���� ���� Ȯ�� �޼���
	public void test2() {
		
		while(true) {
			test();
			System.out.println();
			int pick = 0;
			System.out.println("��� �߱� �Ͻðڽ��ϱ�? \n"
					+ "1. Ƽ�� �߱� \n"
					+ "2.����");
			pick = scanner.nextInt();
			if(pick == 1) {
				continue;
			}else if(pick == 2){
				System.out.println("\nƼ�� �߱��� �����մϴ�. �����մϴ�.");
				break;
			}
		}
	}
}
