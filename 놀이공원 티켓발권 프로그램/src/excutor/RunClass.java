package excutor;

import java.io.IOException;
import dto.TicketDTO;
import inputUtil.InputClass;
import inputUtil.TicketConstants;
import output.LanguagePrintClass;
import output.PrintList;
import saveData.Report;

public class RunClass {

    private TicketDTO ticketDTO = new TicketDTO();
    private PrintList printlist = new PrintList();

    // 3. Run ���� ���� �޼���
    public void startRunFirst() throws IOException{
        TicketCalculator cal = new TicketCalculator();
        // DTO
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
    public void startRunSecond() throws IOException{
    	InputClass.languageChoice();
    	Report.ReportHeadWriter();
    	
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
