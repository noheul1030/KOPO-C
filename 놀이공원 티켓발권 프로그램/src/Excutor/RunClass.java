package Excutor;

import DTO.TicketDTO;
import InputUtil.TicketConstants;
import Output.PrintClass;
import Output.PrintList;

public class RunClass {

    private TicketDTO ticketDTO = new TicketDTO();
    private PrintList printlist = new PrintList();

    // 3. Run ���� ���� �޼���
    public void startRunFirst() {
        TicketCalculator cal = new TicketCalculator();
        ticketDTO.insertRunFirst();

        int total = cal.age(ticketDTO);
        ticketDTO.setTotalPrice(total);
        ticketDTO.setTotalSumPrice(total);

        printlist.saveData(ticketDTO);

        System.out.println("\n������ " + TicketConstants.STRING_DECIMAL_FORMAT.format(total) + " �� �Դϴ�.");
        System.out.println("�����մϴ�.");
    }

    // 4. Ƽ�� �߱��� ���� / ���� ���� Ȯ�� �޼���
    public void startRunSecond() {
        
        while (true) {
        	
            startRunFirst();

            ticketDTO.insertRunSecond();

            int pick = ticketDTO.getReTry();

            if (pick == TicketConstants.CHOICE_NUMBER_ONE) {
                continue;
            } else if (pick ==  TicketConstants.CHOICE_NUMBER_TWO) {
            	PrintClass. print.closePrint();
                break;
            }
        }
        printlist.ticketTotalPrint(ticketDTO);
    }
    
    public void languagechange() {
    	
    }
}
