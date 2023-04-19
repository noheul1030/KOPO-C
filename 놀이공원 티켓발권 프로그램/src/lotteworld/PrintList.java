package lotteworld;

import java.util.ArrayList;
import java.util.List;

public class PrintList {
	private static String ticketType;
	private static String group;
	private static int ticketCount;
	private static int totalPrice;
	private static String preferentialTreatment;
	private static List<OrderList> data = new ArrayList<OrderList>();
	
	public static OrderList orderList = null;
	
	static void saveData(TicketDTO dto) {
		orderList = new OrderList(ticketType, group, ticketCount, totalPrice, preferentialTreatment);
		
		if(dto.getTicketChoice() == 1) {
			orderList.setTicketType("종일권");
		}else {
			orderList.setTicketType("야간권");
		}
		
		orderList.setGroup(TicketDTO.PERSON[dto.getPersonGroupNumber()-1]);
		
		orderList.setTicketCount(dto.getBuyTicketChoice());
		
		orderList.setTotalPrice(dto.getTotalPrice());
		
		orderList.setPreferentialTreatment("우대할인" 
		+ TicketDTO.PREFERENTIAL_TREATMENT_PERSON[dto.getPreferentialTreatment()-1]);	

		data.add(orderList);
	}
	
	public static void ticketTotalPrint(TicketDTO dto) {
		System.out.println();
		System.out.println("=========================== LOTTE WORLD ===========================");
		System.out.printf("%7s%9s%9s%9s%9s\n","권종","그룹","수량","가격","우대사항");
		System.out.println("===================================================================");
		System.out.println();
		OrderListPrint();
		System.out.println();
		System.out.println("===================================================================");
		
		System.out.printf("입장료 총액은 %s원 입니다."
				,TicketDTO.STRING_DECIMAL_FORMAT.format(dto.getTotalSumPrice()));
	}
	
	public static void OrderListPrint() {
		
		for(OrderList order : data) {
			ticketType = order.getTicketType();
			group = order.getGroup();
			ticketCount = order.getTicketCount();
			totalPrice = order.getTotalPrice();
			preferentialTreatment = order.getPreferentialTreatment();
		}		
			System.out.printf("%7s",ticketType);
			System.out.printf("%8s",group);
			System.out.printf("%9s","X  "+ticketCount);
			System.out.printf("%12s원",TicketDTO.STRING_DECIMAL_FORMAT.format(totalPrice));
			System.out.printf("%12s\n","* "+ preferentialTreatment);
	}
}
