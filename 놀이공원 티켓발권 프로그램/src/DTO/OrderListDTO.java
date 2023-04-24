package DTO;

public class OrderListDTO {
	
	private String orderTicketType;
	private String orderGroup;
	private int orderTicketCount;
	private int orderTotalPrice;
	private String orderPreferentialTreatment;
	

	public OrderListDTO(String orderTicketType, String orderGroup, int orderTicketCount, 
			int orderTotalPrice, String orderPreferentialTreatment) {
		this.orderTicketType = orderTicketType;
		this.orderGroup = orderGroup;
		this.orderTicketCount = orderTicketCount;
		this.orderTotalPrice = orderTotalPrice;
		this.orderPreferentialTreatment = orderPreferentialTreatment;
	}

	public String getTicketType() {
		return orderTicketType;
	}

	public String getGroup() {
		return orderGroup;
	}

	public int getTicketCount() {
		return orderTicketCount;
	}

	public int getTotalPrice() {
		return orderTotalPrice;
	}

	public String getPreferentialTreatment() {
		return orderPreferentialTreatment;
	}
}
