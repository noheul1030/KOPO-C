package language;

import dto.OrderListDTO;
import dto.TicketDTO;
import inputUtil.TicketConstants;

public class KoreanLanguage {
	// 한국어
		public static void ticketChoicePrint() {
			System.out.println("발권하실 티켓의 종류를 선택해 주세요. \n" + "1. 종일권 \n" + "2. 야간권");
		}

		public static void residentRegistrationNumberPrint() {
			System.out.println("\n주민등록번호를 입력해 주세요. ( 예시 : 123456-1234567 ) : ");
		}

		public static void buyTicketChoicePrint() {
			System.out.println("\n구매하실 티켓의 갯수를 입력해주세요. (최대 10개): ");
		}

		public static void preferentialTreatmentChoicePrint() {
			System.out.println("\n우대사항을 선택해 주세요. \n" + "1. 없음 \n" + "2. 장애인 \n" + "3. 국가유공자 \n" + "4. 다자녀 \n" + "5. 임산부");
		}

		public static void errorPrint() {
			System.out.println("\n##### 입력 오류 입니다. 다시 입력해주세요 #####");
		}

		public static void totalRePrint() {
			System.out.println("\n계속 발권 하시겠습니까? \n" + "1. 티켓 발권 \n" + "2. 종료");
		}

		public static void closePrint() {
			System.out.println("\n***** 티켓 발권을 종료합니다. 감사합니다. *****");
		}

		public static void ticketTotalHeadPrint() {
			System.out.println();
			System.out.println("============================= LOTTE WORLD =============================");
			System.out.printf("%5s%9s%9s%9s%14s\n", "권종", "그룹", "수량", "가격", "우대사항");
			System.out.println("=======================================================================");
		}
		
//		public static void ticketTotalMiddlePrint(OrderListDTO order) {
//			System.out.printf("%5s", order.getTicketType());
//			System.out.printf("%9s", order.getGroup());
//			System.out.printf("%10s", "X  " + order.getTicketCount());
//			System.out.printf("%12s원", TicketConstants.STRING_DECIMAL_FORMAT.format(order.getTotalPrice()));
//			System.out.printf("%4s%8s\n", " ", "* " + order.getPreferentialTreatment());
//		}

		public static void ticketTotalTailPrint(TicketDTO dto) {
			System.out.println("=======================================================================");
			System.out.println();
			System.out.printf("***** 입장료 총액은 %s원 입니다. *****",
					TicketConstants.STRING_DECIMAL_FORMAT.format(dto.getTotalSumPrice()));
		}
		
		public static void space(OrderListDTO order) {
			if(order.getGroup().getBytes().length < 6) {
				System.out.printf("%9s", order.getGroup());
				for (int i = 0; i < 6-order.getGroup().getBytes().length; i++) {
					System.out.printf("%s", " "); // 공백찍기
				}
			}else {
				System.out.printf("%9s", order.getGroup());
			}
		}

}
