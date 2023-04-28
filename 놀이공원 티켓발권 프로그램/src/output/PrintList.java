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

	// 티켓 TYPE
	public String ticketType(TicketDTO dto) {
		return (dto.getTicketChoice() == TicketConstants.CHOICE_NUMBER_ONE) ? LanguagePrintClass.getMsg("Ticket.AllDay")
				: LanguagePrintClass.getMsg("Ticket.Night");
	}

	// 연령 GROUP
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

	// 티켓 Count
	public int ticketCount(TicketDTO dto) {
		return dto.getBuyTicket();
	}

	// 계산 금액
	public int totalPrice(TicketDTO dto) {
		return dto.getTotalPrice();
	}

	// 우대할인
	public String preferentialTreatment(TicketDTO dto) {
		if (Locale.getDefault() == (Locale.KOREAN)) {
			return TicketConstants.PREFERENTIAL_TREATMENT_PERSON_KR[dto.getPreferentialTreatment() - 1];
		} else if (Locale.getDefault() == (Locale.ENGLISH)) {
			return TicketConstants.PREFERENTIAL_TREATMENT_PERSON_EN[dto.getPreferentialTreatment() - 1];
		}
		return null;

	}

	// 1. OrderList 클래스 생성자에 dto 값 전달 메서드
	public void saveData(TicketDTO dto) {
		orderList = new OrderListDTO(ticketType(dto), group(dto), ticketCount(dto), totalPrice(dto),
				preferentialTreatment(dto));
		data.add(orderList);
	}

	// 글자 간격 맞추기 메서드
	public void space(OrderListDTO order) {
		if (order.getGroup().getBytes().length != TicketConstants.LANGUAGE_length) {
			for (int i = 0; i < TicketConstants.LANGUAGE_length - order.getGroup().getBytes().length; i++) {
				System.out.printf("%s", " ");
			}
		}
	}

	// 2. 누적된 발권정보 출력 메서드
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

			// 날짜, 권종, 연령구분, 수량, 가격, 우대사항 저장
			Report.ReportSaveWriter(TicketConstants.DATA_FORMAT.format(new Date())
					, order.getTicketType(), order.getGroup(), order.getTicketCount()
					, order.getTotalPrice(), order.getPreferentialTreatment());
		}
	}

	// 3. 최종 영수증 출력 메서드
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
