package Excutor;

import DTO.TicketDTO;
import InputUtil.TicketConstants;
import Output.PrintClass;
import Output.PrintList;

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

        System.out.println("\n가격은 " + TicketConstants.STRING_DECIMAL_FORMAT.format(total) + " 원 입니다.");
        System.out.println("감사합니다.");
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
            	PrintClass. print.closePrint();
                break;
            }
        }
        printlist.ticketTotalPrint(ticketDTO);
    }
    
    public void languagechange() {
    	
    }
}
