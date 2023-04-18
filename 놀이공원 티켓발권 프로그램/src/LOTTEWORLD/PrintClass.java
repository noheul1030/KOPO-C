package LOTTEWORLD;

public class PrintClass {
	
	public void ticketChoicePint() {
		System.out.println("발권하실 티켓의 종류를 선택해 주세요. \n" + "1. 종일권 \n" + "2. 야간권");
	}
	public void residentRegistrationNumberPint() {
		System.out.println("\n주민등록번호를 입력해 주세요. ( 예시 : 123456-1234567 ) : ");
	}
	public void buyTicketChoicePint() {
		System.out.println("\n구매하실 티켓의 갯수를 입력해주세요. (최대 10개): ");
	}
	public void preferentialTreatmentChoicePint() {
		System.out.println("\n우대사항을 선택해 주세요. \n" + "1. 없음 \n" + "2. 장애인 \n" + "3. 국가유공자 \n" + "4. 다자녀 \n" + "5. 임산부");
	}
	public void errorPrint() {
		System.out.println("\n##### 입력 오류 입니다. 다시 입력해주세요 #####");
	}
	public void totalRePrint() {
		System.out.println("\n계속 발권 하시겠습니까? \n" + "1. 티켓 발권 \n" + "2. 종료");
	}
	public void closePrint() {
		System.out.println("\n***** 티켓 발권을 종료합니다. 감사합니다. *****");
	}
}
