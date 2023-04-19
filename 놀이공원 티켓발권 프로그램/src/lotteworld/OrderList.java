package lotteworld;

public class OrderList {
	
	private String ticketType;
	private String group;
	private int ticketCount;
	private int totalPrice;
	private String preferentialTreatment;
	

	public OrderList(String ticketType, String group, int ticketCount, int totalPrice, String preferentialTreatment) {
		this.ticketType = ticketType;
		this.group = group;
		this.ticketCount = ticketCount;
		this.totalPrice = totalPrice;
		this.preferentialTreatment = preferentialTreatment;
	}

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int getTicketCount() {
		return ticketCount;
	}

	public void setTicketCount(int ticketCount) {
		this.ticketCount = ticketCount;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getPreferentialTreatment() {
		return preferentialTreatment;
	}

	public void setPreferentialTreatment(String preferentialTreatment) {
		this.preferentialTreatment = preferentialTreatment;
	}

}
