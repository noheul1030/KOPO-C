package lotteworld;

import java.util.List;

public class OrderList {
    public String id, optionString;
    public int age, option, amount, cost;

    // public List<OrderList> data = new ArrayList<OrderList>();
    //
    //
    //
    // OrderList order = new OrderList();
    // order.id = idNumber;
    // order.age = age;
    // order.option = preferOption;
    // order.amount = amount;
    // order.cost = cost;
    // data.add(order);

    // for(OrderList order : ls.data) {
    //
    // }

    public void printReport(List<TicketDTO> ticketList) {

        // Ƽ�ϸ�� �������

        StringBuffer buffer = new StringBuffer();
        buffer.append("��¥").append(',');
        buffer.append("����").append(',');
        // �Ϻλ��� ����. ���� �ʿ�
        buffer.append("������");

        // Ƽ�ϸ�� ����Ÿ �ݺ����
        for (TicketDTO dto : ticketList) {
            buffer = new StringBuffer();
            buffer.append(dto.getResidentRegistrationNumber()).append(',');
            buffer.append(dto.getTicketChoice()).append(',');
            // �Ϻλ��� ����. ���� �ʿ�
            buffer.append(dto.getPreferentialTreatment());
            System.out.println(buffer.toString());
        }
    }
}
