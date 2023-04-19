package lotteworld;

import java.time.LocalDate;
import java.time.Period;

public class TicketCalculator {

    // 1. �� ���� ��� �޼���
    public int age(TicketDTO dto) {

        int age = 0;

        int birthYear = Integer.parseInt(dto.getResidentRegistrationNumber().substring(0, 2));
        int birthMonth = Integer.parseInt(dto.getResidentRegistrationNumber().substring(2, 4));
        int birthDay = Integer.parseInt(dto.getResidentRegistrationNumber().substring(4, 6));

        int index = Integer.parseInt(dto.getResidentRegistrationNumber().substring(7, 8));        

        if (index == 3 || index == 4) {
            birthYear = birthYear + TicketDTO.NEW_GENERATION;
        } else {
            birthYear = birthYear + TicketDTO.OLD_GENERATION;
        }

        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);

        Period agePeriod = Period.between(birthDate, TicketDTO.CURRENT_DATE);

        age = agePeriod.getYears();

        if (birthMonth > TicketDTO.CURRENT_DATE.getMonthValue()
                || (birthMonth == TicketDTO.CURRENT_DATE.getMonthValue() && birthDay > TicketDTO.CURRENT_DATE.getDayOfMonth())) {
            age--;
        }
       
        int result = ticketPrice(dto.getTicketChoice(), ageGroup(age,dto));
        int result2 = total(result, dto.getBuyTicketChoice());
        return (int)(result2 * preferentialTreatmentSale(dto.getPreferentialTreatment()));
    }

    // 2. ������ ���ÿ� ���� ������ �ʱⰪ ���� �޼���
    public double preferentialTreatmentSale(int preferentialTreatmentChoice) {
    	
        return TicketDTO.PREFERENTIAL_TREATMENT_DISCOUNT[preferentialTreatmentChoice-1];
    }

    // 3. ���̿� ���� �׷� ��ȣ ����
    public TicketPriceEnum ageGroup(int age,TicketDTO dto) {

        if (TicketDTO.MIN_ADULT <= age && age <= TicketDTO.MAX_ADULT) {
        	dto.setPersonGroupNumber(TicketDTO.ADULT);
            return TicketPriceEnum.ADULT;
        } else if (TicketDTO.MIN_TEEN <= age && age <= TicketDTO.MAX_TEEN) {
        	dto.setPersonGroupNumber(TicketDTO.TEENAGE);
            return TicketPriceEnum.TEENAGE;
        } else if (TicketDTO.MIN_CHILD <= age && age <= TicketDTO.MAX_CHILD) {
        	dto.setPersonGroupNumber(TicketDTO.CHILD);
            return TicketPriceEnum.CHILD;
        } else if (TicketDTO.MIN_BABY <= age && age < TicketDTO.MIN_CHILD) {
        	dto.setPersonGroupNumber(TicketDTO.BABY);
            return TicketPriceEnum.BABY;
        }else {
        	dto.setPersonGroupNumber(TicketDTO.OLDMAN);
        	return TicketPriceEnum.OLDMAN;
        }
    }

    // 4. ������ Ƽ�ϰ� ���̸� ����Ͽ� �ݾ��� �����ϴ� �޼���
    public int ticketPrice(int ticketChoice, TicketPriceEnum ageGroup) {
        // ���ϱ� ����
        if (ticketChoice == 1) {
            return ageGroup.getDayPrice();
        }
        // �߰��� ����
        else {
            return ageGroup.getNightPrice();
        }
    }

    // 5. ����� Ƽ�ϰ��ݰ� �ֹ� ������ ����ϴ� �޼���
    public int total(int ticketPrice, int buyTicketChoice) {

        return ticketPrice * buyTicketChoice;
    }
}
