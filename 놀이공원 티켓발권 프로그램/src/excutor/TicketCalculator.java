package excutor;

import dto.TicketDTO;
import dto.TicketPriceEnum;
import inputUtil.AgeCheck;
import inputUtil.TicketConstants;

public class TicketCalculator {

	// 1. ��� �޼���
	public int age(TicketDTO inputDTO) {
		int age = AgeCheck.ageCheck(inputDTO.getResidentRegistrationNumber());
		int result = ticketPrice(inputDTO.getTicketChoice(), ageGroup(age));
		int result2 = total(result, inputDTO.getBuyTicket());

		return (int) (result2 * preferentialTreatmentSale(inputDTO.getPreferentialTreatment()));
	}

	// 2. ���̿� ���� ����
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

	// 3. ������ Ƽ�ϰ� ���̸� ����Ͽ� �ݾ��� �����ϴ� �޼���
	public int ticketPrice(int ticketChoice, TicketPriceEnum ageGroup) {
		
		return (ticketChoice == TicketConstants.CHOICE_NUMBER_ONE) ? ageGroup.getDayPrice() : ageGroup.getNightPrice();
	}

	// 4. ����� Ƽ�ϰ��ݰ� �ֹ� ������ ����ϴ� �޼���
	public int total(int ticketPrice, int buyTicketChoice) {

		return ticketPrice * buyTicketChoice;
	}

	// 5. ������ ���ÿ� ���� ������ �ʱⰪ ���� �޼���
	public double preferentialTreatmentSale(int preferentialTreatmentChoice) {

		return TicketConstants.PREFERENTIAL_TREATMENT_DISCOUNT[preferentialTreatmentChoice - 1];
	}
}
