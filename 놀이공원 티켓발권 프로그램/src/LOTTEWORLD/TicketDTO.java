package LOTTEWORLD;

public class TicketDTO {

	private int ticketChoice, buyTicket, preferentialTreatment, reTry;
	private String residentRegistrationNumber;
	

	// 1.티켓 종류
	public int getTicketChoice() {
		return ticketChoice;
	}

	public void setTicketChoice(int ticketChoice) {
		this.ticketChoice = ticketChoice;
	}
	// 2. 주민등록번호
	public String getResidentRegistrationNumber() {
		return residentRegistrationNumber;
	}
	
	public void setResidentRegistrationNumber(String residentRegistrationNumber) {
		this.residentRegistrationNumber = residentRegistrationNumber;
	}
	// 3. 주문 갯수
	public int getBuyTicketChoice() {
		return buyTicket;
	}

	public void setBuyTicketChoice(int buyTicket) {
		this.buyTicket = buyTicket;
	}
	// 4. 우대사항 선택
	public int getPreferentialTreatment() {
		return preferentialTreatment;
	}

	public void setPreferentialTreatment(int preferentialTreatment) {
		this.preferentialTreatment = preferentialTreatment;
	}
	// 5. 재시작 여부
	public int getReTry() {
		return reTry;
	}

	public void setReTry(int reTry) {
		this.reTry = reTry;
	}
}
