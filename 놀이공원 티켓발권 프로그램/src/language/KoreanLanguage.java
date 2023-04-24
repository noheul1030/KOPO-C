package language;

import dto.OrderListDTO;
import dto.TicketDTO;
import inputUtil.TicketConstants;

public class KoreanLanguage {
	// �ѱ���
		public static void ticketChoicePrint() {
			System.out.println("�߱��Ͻ� Ƽ���� ������ ������ �ּ���. \n" + "1. ���ϱ� \n" + "2. �߰���");
		}

		public static void residentRegistrationNumberPrint() {
			System.out.println("\n�ֹε�Ϲ�ȣ�� �Է��� �ּ���. ( ���� : 123456-1234567 ) : ");
		}

		public static void buyTicketChoicePrint() {
			System.out.println("\n�����Ͻ� Ƽ���� ������ �Է����ּ���. (�ִ� 10��): ");
		}

		public static void preferentialTreatmentChoicePrint() {
			System.out.println("\n�������� ������ �ּ���. \n" + "1. ���� \n" + "2. ����� \n" + "3. ���������� \n" + "4. ���ڳ� \n" + "5. �ӻ��");
		}

		public static void errorPrint() {
			System.out.println("\n##### �Է� ���� �Դϴ�. �ٽ� �Է����ּ��� #####");
		}

		public static void totalRePrint() {
			System.out.println("\n��� �߱� �Ͻðڽ��ϱ�? \n" + "1. Ƽ�� �߱� \n" + "2. ����");
		}

		public static void closePrint() {
			System.out.println("\n***** Ƽ�� �߱��� �����մϴ�. �����մϴ�. *****");
		}

		public static void ticketTotalHeadPrint() {
			System.out.println();
			System.out.println("============================= LOTTE WORLD =============================");
			System.out.printf("%5s%9s%9s%9s%14s\n", "����", "�׷�", "����", "����", "������");
			System.out.println("=======================================================================");
		}
		
//		public static void ticketTotalMiddlePrint(OrderListDTO order) {
//			System.out.printf("%5s", order.getTicketType());
//			System.out.printf("%9s", order.getGroup());
//			System.out.printf("%10s", "X  " + order.getTicketCount());
//			System.out.printf("%12s��", TicketConstants.STRING_DECIMAL_FORMAT.format(order.getTotalPrice()));
//			System.out.printf("%4s%8s\n", " ", "* " + order.getPreferentialTreatment());
//		}

		public static void ticketTotalTailPrint(TicketDTO dto) {
			System.out.println("=======================================================================");
			System.out.println();
			System.out.printf("***** ����� �Ѿ��� %s�� �Դϴ�. *****",
					TicketConstants.STRING_DECIMAL_FORMAT.format(dto.getTotalSumPrice()));
		}
		
		public static void space(OrderListDTO order) {
			if(order.getGroup().getBytes().length < 6) {
				System.out.printf("%9s", order.getGroup());
				for (int i = 0; i < 6-order.getGroup().getBytes().length; i++) {
					System.out.printf("%s", " "); // �������
				}
			}else {
				System.out.printf("%9s", order.getGroup());
			}
		}

}
