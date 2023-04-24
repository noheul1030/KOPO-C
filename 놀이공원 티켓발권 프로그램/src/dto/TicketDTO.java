package dto;

import inputUtil.InputClass;

public class TicketDTO {
	private InputClass input = new InputClass();
	
	private int ticketChoice, buyTicket, preferentialTreatment;
	private String residentRegistrationNumber,personGroup;
	private int reTry,totalPrice, totalSumPrice;

	// �Է� �� set ���� �޼���
	public void insertRunFirst() {
		setTicketChoice(input.ticketChoice());
		setResidentRegistrationNumber(input.residentRegistrationNumber());
		setBuyTicket(input.buyTicketChoice());
		setPreferentialTreatment(input.preferentialTreatmentChoice());
	}

	// �Է� �� set ���� �޼���2
	public void insertRunSecond() {
		setReTry(input.reTry());
	}

	
	// 1. Ƽ�� ���� ����
	public int getTicketChoice() {
		return this.ticketChoice;
	}

	public void setTicketChoice(int ticketChoice) {
		this.ticketChoice = ticketChoice;
	}

	// 2. �ֹ� ����
	public int getBuyTicket() {
		return this.buyTicket;
	}

	public void setBuyTicket(int buyTicket) {
		this.buyTicket = buyTicket;
	}

	// 3. ������ ����
	public int getPreferentialTreatment() {
		return this.preferentialTreatment;
	}

	public void setPreferentialTreatment(int preferentialTreatment) {
		this.preferentialTreatment = preferentialTreatment;
	}

	// 4. �ֹι�ȣ �Է�
	public String getResidentRegistrationNumber() {
		return this.residentRegistrationNumber;
	}

	public void setResidentRegistrationNumber(String residentRegistrationNumber) {
		this.residentRegistrationNumber = residentRegistrationNumber;
	}

	// 5. ���̿� ���� �׷�
	public String getPersonGroup() {
		return personGroup;
	}

	public void setPersonGroup(String personGroup) {
		this.personGroup = personGroup;
	}

	// 6. ����� ����
	public int getReTry() {
		return reTry;
	}

	public void setReTry(int reTry) {
		this.reTry = reTry;
	}

	// 7. �ݾ� ���
	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	// 8. ���� ���� �ݾ� ���
	public int getTotalSumPrice() {
		return totalSumPrice;
	}

	public void setTotalSumPrice(int totalSumPrice) {
		this.totalSumPrice += totalSumPrice;
	}

}
