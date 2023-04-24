package excutor;

import dto.TicketDTO;
import dto.TicketPriceEnum;
import inputUtil.AgeCheck;
import inputUtil.TicketConstants;

public class TicketCalculator {

	// 1. 계산 메서드
	public int age(TicketDTO inputDTO) {
		int age = AgeCheck.ageCheck(inputDTO.getResidentRegistrationNumber());
		int result = ticketPrice(inputDTO.getTicketChoice(), ageGroup(age));
		int result2 = total(result, inputDTO.getBuyTicket());

		return (int) (result2 * preferentialTreatmentSale(inputDTO.getPreferentialTreatment()));
	}

	// 2. 나이에 따른 가격
	public TicketPriceEnum ageGroup(int age) {

		if (TicketConstants.MIN_ADULT <= age && age <= TicketConstants.MAX_ADULT) {
			return TicketPriceEnum.ADULT;
		} else if (TicketConstants.MIN_TEEN <= age && age <= TicketConstants.MAX_TEEN) {
			return TicketPriceEnum.TEENAGE;
		} else if (TicketConstants.MIN_CHILD <= age && age <= TicketConstants.MAX_CHILD) {
			return TicketPriceEnum.CHILD;
		} else if (TicketConstants.MIN_BABY <= age && age < TicketConstants.MIN_CHILD) {
			return TicketPriceEnum.BABY;
		} else {
			return TicketPriceEnum.OLDMAN;
		}
	}

	// 3. 선택한 티켓과 나이를 계산하여 금액을 산출하는 메서드
	public int ticketPrice(int ticketChoice, TicketPriceEnum ageGroup) {
		
		return (ticketChoice == TicketConstants.CHOICE_NUMBER_ONE) ? ageGroup.getDayPrice() : ageGroup.getNightPrice();
	}

	// 4. 산출된 티켓가격과 주문 갯수를 계산하는 메서드
	public int total(int ticketPrice, int buyTicketChoice) {

		return ticketPrice * buyTicketChoice;
	}

	// 5. 우대사항 선택에 따른 할인율 초기값 지정 메서드
	public double preferentialTreatmentSale(int preferentialTreatmentChoice) {

		return TicketConstants.PREFERENTIAL_TREATMENT_DISCOUNT[preferentialTreatmentChoice - 1];
	}
}
