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

        // 티켓목록 제목출력

        StringBuffer buffer = new StringBuffer();
        buffer.append("날짜").append(',');
        buffer.append("권종").append(',');
        // 일부생략 했음. 구현 필요
        buffer.append("우대사항");

        // 티켓목록 데이타 반복출력
        for (TicketDTO dto : ticketList) {
            buffer = new StringBuffer();
            buffer.append(dto.getResidentRegistrationNumber()).append(',');
            buffer.append(dto.getTicketChoice()).append(',');
            // 일부생략 했음. 구현 필요
            buffer.append(dto.getPreferentialTreatment());
            System.out.println(buffer.toString());
        }
    }
}
