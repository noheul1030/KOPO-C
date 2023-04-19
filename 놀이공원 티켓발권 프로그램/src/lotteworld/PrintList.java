package lotteworld;

import java.util.ArrayList;
import java.util.List;

public class PrintList {

    private List<OrderList> data = new ArrayList<OrderList>();
    private OrderList orderList = null;

    // 1. OrderList Ŭ���� �����ڿ� dto �� ���� �޼���
    public void saveData(TicketDTO dto) {
        String ticketType, group, preferentialTreatment;
        int ticketCount, totalPrice;

        if (dto.getTicketChoice() == 1) {
            ticketType = "���ϱ�";
        } else {
            ticketType = "�߰���";
        }

        group = TicketDTO.PERSON[dto.getPersonGroupNumber() - 1];

        ticketCount = dto.getBuyTicketChoice();

        totalPrice = dto.getTotalPrice();

        preferentialTreatment = "������� " + TicketDTO.PREFERENTIAL_TREATMENT_PERSON[dto.getPreferentialTreatment() - 1];

        orderList = new OrderList(ticketType, group, ticketCount, totalPrice, preferentialTreatment);
        data.add(orderList);
    }

    // 2. ���� ������ ��� �޼���
    public void ticketTotalPrint(TicketDTO dto) {
        System.out.println();
        System.out.println("======================== LOTTE WORLD ========================");
        System.out.printf("%5s%9s%9s%9s%14s\n", "����", "�׷�", "����", "����", "������");
        System.out.println("=============================================================");

        OrderListPrint();

        System.out.println("=============================================================");
        System.out.println();
        System.out.printf("***** ����� �Ѿ��� %s�� �Դϴ�. *****",
                TicketDTO.STRING_DECIMAL_FORMAT.format(dto.getTotalSumPrice()));
    }

    // 3. ������ �߱����� ��� �޼���
    public void OrderListPrint() {

        for (OrderList order : data) {

            System.out.printf("%5s", order.getTicketType());
            System.out.printf("%9s", order.getGroup());
            System.out.printf("%10s", "X  " + order.getTicketCount());
            System.out.printf("%12s��", TicketDTO.STRING_DECIMAL_FORMAT.format(order.getTotalPrice()));
            System.out.printf("%4s%8s\n", " ", "* " + order.getPreferentialTreatment());
        }
    }
}
