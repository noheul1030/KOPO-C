package excutor;

import dto.TicketDTO;
import inputUtil.TicketConstants;
import output.LanguagePrintClass;
import output.PrintList;

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

        System.out.printf("\n%s : %s %s\n",LanguagePrintClass.getMsg("OrderSummaryPrint.price")
        		,TicketConstants.STRING_DECIMAL_FORMAT.format(total)
        		,LanguagePrintClass.getMsg("OrderSummaryPrint.won"));
        System.out.println(LanguagePrintClass.getMsg("Print.thanks"));
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
            	
                break;
            }
        }
        printlist.ticketTotalPrint(ticketDTO);
        
        System.out.println(LanguagePrintClass.getMsg("Print.close"));
    }
    
}
