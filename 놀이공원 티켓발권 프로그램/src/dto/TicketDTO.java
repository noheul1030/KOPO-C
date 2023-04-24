package dto;

import inputUtil.InputClass;

public class TicketDTO {
	private InputClass input = new InputClass();
	
	private int ticketChoice, buyTicket, preferentialTreatment;
	private String residentRegistrationNumber,personGroup;
	private int reTry,totalPrice, totalSumPrice;

	// 입력 값 set 전달 메서드
	public void insertRunFirst() {
		setTicketChoice(input.ticketChoice());
		setResidentRegistrationNumber(input.residentRegistrationNumber());
		setBuyTicket(input.buyTicketChoice());
		setPreferentialTreatment(input.preferentialTreatmentChoice());
	}

	// 입력 값 set 전달 메서드2
	public void insertRunSecond() {
		setReTry(input.reTry());
	}

	
	// 1. 티켓 종류 선택
	public int getTicketChoice() {
		return this.ticketChoice;
	}

	public void setTicketChoice(int ticketChoice) {
		this.ticketChoice = ticketChoice;
	}

	// 2. 주문 갯수
	public int getBuyTicket() {
		return this.buyTicket;
	}

	public void setBuyTicket(int buyTicket) {
		this.buyTicket = buyTicket;
	}

	// 3. 우대사항 선택
	public int getPreferentialTreatment() {
		return this.preferentialTreatment;
	}

	public void setPreferentialTreatment(int preferentialTreatment) {
		this.preferentialTreatment = preferentialTreatment;
	}

	// 4. 주민번호 입력
	public String getResidentRegistrationNumber() {
		return this.residentRegistrationNumber;
	}

	public void setResidentRegistrationNumber(String residentRegistrationNumber) {
		this.residentRegistrationNumber = residentRegistrationNumber;
	}

	// 5. 나이에 따른 그룹
	public String getPersonGroup() {
		return personGroup;
	}

	public void setPersonGroup(String personGroup) {
		this.personGroup = personGroup;
	}

	// 6. 재시작 여부
	public int getReTry() {
		return reTry;
	}

	public void setReTry(int reTry) {
		this.reTry = reTry;
	}

	// 7. 금액 계산
	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	// 8. 최종 누적 금액 계산
	public int getTotalSumPrice() {
		return totalSumPrice;
	}

	public void setTotalSumPrice(int totalSumPrice) {
		this.totalSumPrice += totalSumPrice;
	}

}
