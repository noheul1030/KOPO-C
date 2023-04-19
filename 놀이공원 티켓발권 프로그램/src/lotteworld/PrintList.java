package lotteworld;

import java.util.ArrayList;
import java.util.List;

public class PrintList {

    private List<OrderList> data = new ArrayList<OrderList>();
    private OrderList orderList = null;

    // 1. OrderList 클래스 생성자에 dto 값 전달 메서드
    public void saveData(TicketDTO dto) {
        String ticketType, group, preferentialTreatment;
        int ticketCount, totalPrice;

        if (dto.getTicketChoice() == 1) {
            ticketType = "종일권";
        } else {
            ticketType = "야간권";
        }

        group = TicketDTO.PERSON[dto.getPersonGroupNumber() - 1];

        ticketCount = dto.getBuyTicketChoice();

        totalPrice = dto.getTotalPrice();

        preferentialTreatment = "우대할인 " + TicketDTO.PREFERENTIAL_TREATMENT_PERSON[dto.getPreferentialTreatment() - 1];

        orderList = new OrderList(ticketType, group, ticketCount, totalPrice, preferentialTreatment);
        data.add(orderList);
    }

    // 2. 최종 영수증 출력 메서드
    public void ticketTotalPrint(TicketDTO dto) {
        System.out.println();
        System.out.println("======================== LOTTE WORLD ========================");
        System.out.printf("%5s%9s%9s%9s%14s\n", "권종", "그룹", "수량", "가격", "우대사항");
        System.out.println("=============================================================");

        OrderListPrint();

        System.out.println("=============================================================");
        System.out.println();
        System.out.printf("***** 입장료 총액은 %s원 입니다. *****",
                TicketDTO.STRING_DECIMAL_FORMAT.format(dto.getTotalSumPrice()));
    }

    // 3. 누적된 발권정보 출력 메서드
    public void OrderListPrint() {

        for (OrderList order : data) {

            System.out.printf("%5s", order.getTicketType());
            System.out.printf("%9s", order.getGroup());
            System.out.printf("%10s", "X  " + order.getTicketCount());
            System.out.printf("%12s원", TicketDTO.STRING_DECIMAL_FORMAT.format(order.getTotalPrice()));
            System.out.printf("%4s%8s\n", " ", "* " + order.getPreferentialTreatment());
        }
    }
}
