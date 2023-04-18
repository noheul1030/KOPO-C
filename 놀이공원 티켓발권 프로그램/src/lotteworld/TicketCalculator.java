package lotteworld;

import java.time.LocalDate;
import java.time.Period;

public class TicketCalculator {

    // 1. 만 나이 계산 메서드
    public int age(TicketDTO dto) {

        int age = 0;

        int birthYear = Integer.parseInt(dto.getResidentRegistrationNumber().substring(0, 2));
        int birthMonth = Integer.parseInt(dto.getResidentRegistrationNumber().substring(2, 4));
        int birthDay = Integer.parseInt(dto.getResidentRegistrationNumber().substring(4, 6));

        int index = Integer.parseInt(dto.getResidentRegistrationNumber().substring(7, 8));

        LocalDate currentDate = LocalDate.now();

        if (index == 3 || index == 4) {
            birthYear = birthYear + 2000;
        } else {
            birthYear = birthYear + 1900;
        }

        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);

        Period agePeriod = Period.between(birthDate, currentDate);

        age = agePeriod.getYears();

        if (birthMonth > currentDate.getMonthValue()
                || (birthMonth == currentDate.getMonthValue() && birthDay > currentDate.getDayOfMonth())) {
            age--;
        }
        int result = ticketPrice(dto.getTicketChoice(), ageGroup(age));
        return total(result, dto.getBuyTicketChoice());
    }

    // 2. 우대사항 선택에 따른 할인율 초기값 지정 메서드
    public double preferentialTreatmentSale(int preferentialTreatmentChoice) {
        double[] preferentialTreatmentSale = { 0.0, 1.0, 0.5, 0.5, 0.7, 0.5 };

        return preferentialTreatmentSale[preferentialTreatmentChoice];
    }

    // 3. 나이에 따른 그룹 번호 지정
    public TicketPriceEnum ageGroup(int age) {

        if (18 <= age && age < 65) {
            return TicketPriceEnum.ADULT;
        } else if (13 <= age && age <= 18) {
            return TicketPriceEnum.TEENAGE;
        } else if (3 <= age && age <= 12) {
            return TicketPriceEnum.CHILD;
        } else if (age < 3) {
            return TicketPriceEnum.BABY;
        }
        return TicketPriceEnum.OLDMAN;
    }

    // 4. 선택한 티켓과 나이를 계산하여 금액을 산출하는 메서드
    public int ticketPrice(int ticketChoice, TicketPriceEnum ageGroup) {
        // 종일권 가격
        if (ticketChoice == 1) {
            return ageGroup.getDayPrice();
        }
        // 야간권 가격
        else {
            return ageGroup.getNightPrice();
        }
    }

    // 5. 산출된 티켓가격과 주문 갯수를 계산하는 메서드
    public int total(int ticketPrice, int buyTicketChoice) {

        return ticketPrice * buyTicketChoice;
    }
}
