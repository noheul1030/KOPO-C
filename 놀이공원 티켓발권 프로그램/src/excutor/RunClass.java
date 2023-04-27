package excutor;

import dto.TicketDTO;
import inputUtil.TicketConstants;
import output.LanguagePrintClass;
import output.PrintList;

public class RunClass {

    private TicketDTO ticketDTO = new TicketDTO();
    private PrintList printlist = new PrintList();

    // 3. Run 실행 시작 메서드
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

    // 4. 티켓 발권의 지속 / 종료 여부 확인 메서드
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
