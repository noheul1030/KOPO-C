package LOTTEWORLD;

public class TicketDTO {

	private int ticketChoice, buyTicket, preferentialTreatment, reTry;
	private String residentRegistrationNumber;
	

	// 1.Ƽ�� ����
	public int getTicketChoice() {
		return ticketChoice;
	}

	public void setTicketChoice(int ticketChoice) {
		this.ticketChoice = ticketChoice;
	}
	// 2. �ֹε�Ϲ�ȣ
	public String getResidentRegistrationNumber() {
		return residentRegistrationNumber;
	}
	
	public void setResidentRegistrationNumber(String residentRegistrationNumber) {
		this.residentRegistrationNumber = residentRegistrationNumber;
	}
	// 3. �ֹ� ����
	public int getBuyTicketChoice() {
		return buyTicket;
	}

	public void setBuyTicketChoice(int buyTicket) {
		this.buyTicket = buyTicket;
	}
	// 4. ������ ����
	public int getPreferentialTreatment() {
		return preferentialTreatment;
	}

	public void setPreferentialTreatment(int preferentialTreatment) {
		this.preferentialTreatment = preferentialTreatment;
	}
	// 5. ����� ����
	public int getReTry() {
		return reTry;
	}

	public void setReTry(int reTry) {
		this.reTry = reTry;
	}
}
