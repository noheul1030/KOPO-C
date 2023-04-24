package Output;

import java.util.ArrayList;
import java.util.List;

import DTO.OrderListDTO;
import DTO.TicketDTO;
import DTO.TicketPriceEnum;
import Excutor.TicketCalculator;
import InputUtil.AgeCheck;
import InputUtil.TicketConstants;

public class PrintList {

	private List<OrderListDTO> data = new ArrayList<OrderListDTO>();
	private OrderListDTO orderList = null;
	private TicketCalculator cal = new TicketCalculator();

	// Ƽ�� TYPE
	public String ticketType(TicketDTO dto) {
		return (dto.getTicketChoice() == TicketConstants.CHOICE_NUMBER_ONE) ? TicketConstants.DAY_TICKET
				: TicketConstants.NIGHT_TICKET;
	}

	// ���� GROUP
	public String group(TicketDTO dto) {
		int age = AgeCheck.ageCheck(dto.getResidentRegistrationNumber());
		TicketPriceEnum ageGroup = cal.ageGroup(age);
		return ageGroup.getPersonGroup();
	}

	// Ƽ�� Count
	public int ticketCount(TicketDTO dto) {
		return dto.getBuyTicket();
	}

	// ��� �ݾ�
	public int totalPrice(TicketDTO dto) {
		return dto.getTotalPrice();
	}

	// �������
	public String preferentialTreatment(TicketDTO dto) {
		return "������� " + TicketConstants.PREFERENTIAL_TREATMENT_PERSON[dto.getPreferentialTreatment() - 1];
	}

	// 1. OrderList Ŭ���� �����ڿ� dto �� ���� �޼���
	public void saveData(TicketDTO dto) {
		orderList = new OrderListDTO(ticketType(dto), group(dto), ticketCount(dto), totalPrice(dto),
				preferentialTreatment(dto));
		data.add(orderList);
	}

	
	// 2. ������ �߱����� ��� �޼���
	public void OrderListPrint() {

		for (OrderListDTO order : data) {

			System.out.printf("%5s", order.getTicketType());
			PrintClass.space(order);
			System.out.printf("%10s", "X  " + order.getTicketCount());
			System.out.printf("%12s��", TicketConstants.STRING_DECIMAL_FORMAT.format(order.getTotalPrice()));
			System.out.printf("%4s%8s\n", " ", "* " + order.getPreferentialTreatment());
		}
	}

	// 3. ���� ������ ��� �޼���
	public void ticketTotalPrint(TicketDTO dto) {
		PrintClass.ticketTotalHeadPrint();
		OrderListPrint();
		PrintClass.ticketTotalTailPrint(dto);
	}
}
