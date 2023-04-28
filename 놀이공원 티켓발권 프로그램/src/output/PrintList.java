package output;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import dto.OrderListDTO;
import dto.TicketDTO;
import dto.TicketPriceEnum;
import excutor.TicketCalculator;
import inputUtil.AgeCheck;
import inputUtil.TicketConstants;
import saveData.Report;

public class PrintList {

	private List<OrderListDTO> data = new ArrayList<OrderListDTO>();
	private OrderListDTO orderList = null;
	private TicketCalculator cal = new TicketCalculator();

	// Ƽ�� TYPE
	public String ticketType(TicketDTO dto) {
		return (dto.getTicketChoice() == TicketConstants.CHOICE_NUMBER_ONE) ? LanguagePrintClass.getMsg("Ticket.AllDay")
				: LanguagePrintClass.getMsg("Ticket.Night");
	}

	// ���� GROUP
	public String group(TicketDTO dto) {
		int age = AgeCheck.ageCheck(dto.getResidentRegistrationNumber());
		TicketPriceEnum ageGroup = cal.ageGroup(age);
		if (Locale.getDefault() == (Locale.KOREAN)) {
			return ageGroup.getPersonGroup_KR();
		} else if (Locale.getDefault() == (Locale.ENGLISH)) {
			return ageGroup.getPersonGroup_US();
		}
		return null;
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
		if (Locale.getDefault() == (Locale.KOREAN)) {
			return TicketConstants.PREFERENTIAL_TREATMENT_PERSON_KR[dto.getPreferentialTreatment() - 1];
		} else if (Locale.getDefault() == (Locale.ENGLISH)) {
			return TicketConstants.PREFERENTIAL_TREATMENT_PERSON_EN[dto.getPreferentialTreatment() - 1];
		}
		return null;

	}

	// 1. OrderList Ŭ���� �����ڿ� dto �� ���� �޼���
	public void saveData(TicketDTO dto) {
		orderList = new OrderListDTO(ticketType(dto), group(dto), ticketCount(dto), totalPrice(dto),
				preferentialTreatment(dto));
		data.add(orderList);
	}

	// ���� ���� ���߱� �޼���
	public void space(OrderListDTO order) {
		if (order.getGroup().getBytes().length != TicketConstants.LANGUAGE_length) {
			for (int i = 0; i < TicketConstants.LANGUAGE_length - order.getGroup().getBytes().length; i++) {
				System.out.printf("%s", " ");
			}
		}
	}

	// 2. ������ �߱����� ��� �޼���
	public void OrderListPrint() throws IOException {

		for (OrderListDTO order : data) {
			System.out.printf("%2s", " ");
			System.out.printf("%s", order.getTicketType());
			space(order);
			System.out.printf("%4s", " ");
			System.out.printf("%s", order.getGroup());
			System.out.printf("%6s", " ");
			System.out.printf("%s", "X  " + order.getTicketCount());
			System.out.printf("%14s", TicketConstants.STRING_DECIMAL_FORMAT.format(order.getTotalPrice())+
					LanguagePrintClass.getMsg("OrderSummaryPrint.won"));
			System.out.printf("%3s", " ");
			System.out.printf("%s %s\n", LanguagePrintClass.getMsg("Print.discount"), order.getPreferentialTreatment());

			// ��¥, ����, ���ɱ���, ����, ����, ������ ����
			Report.ReportSaveWriter(TicketConstants.DATA_FORMAT.format(new Date())
					, order.getTicketType(), order.getGroup(), order.getTicketCount()
					, order.getTotalPrice(), order.getPreferentialTreatment());
		}
	}

	// 3. ���� ������ ��� �޼���
	public void ticketTotalPrint(TicketDTO dto) throws IOException{
		System.out.println(LanguagePrintClass.getMsg("Print.head"));
		System.out.printf("%3s", " ");
		System.out.printf("%s", LanguagePrintClass.getMsg("OrderSummaryPrint.type"));
		System.out.printf("%8s", " ");
		System.out.printf("%s", LanguagePrintClass.getMsg("OrderSummaryPrint.group"));
		System.out.printf("%6s", " ");
		System.out.printf("%s", LanguagePrintClass.getMsg("OrderSummaryPrint.count"));
		System.out.printf("%8s", " ");
		System.out.printf("%s", LanguagePrintClass.getMsg("OrderSummaryPrint.price"));
		System.out.printf("%6s", " ");
		System.out.printf("%s\n", LanguagePrintClass.getMsg("OrderSummaryPrint.preferentialTreatment"));

		System.out.println(LanguagePrintClass.getMsg("Print.line"));
		OrderListPrint();
		System.out.println(LanguagePrintClass.getMsg("Print.line"));
		System.out.println(MessageFormat.format(LanguagePrintClass.getMsg("OrderSummaryPrint.totalPrice"),
				dto.getTotalSumPrice()));
	}
}
