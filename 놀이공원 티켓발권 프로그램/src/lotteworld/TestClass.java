package lotteworld;

public class TestClass {
		
    private InputClass input = new InputClass();
    private TicketDTO dto = new TicketDTO();
    
    public void excute() {
        dto.setTicketChoice(input.ticketChoice());
        dto.setResidentRegistrationNumber(input.residentRegistrationNumber());
        dto.setBuyTicketChoice(input.buyTicketChoice());
        dto.setPreferentialTreatment(input.preferentialTreatmentChoice());
    }

    public void excute2() {
        dto.setReTry(input.reTry());
    }

    // 1. Test 계산 실행 메서드
    public void totalTest() {
        TicketCalculator cal = new TicketCalculator();

        // 티켓정보 입력받기
        excute();

        int total = cal.age(dto);
        dto.setTotalPrice(total);
        dto.setTotalSumPrice(total);
        
        PrintList.saveData(dto);
        
        System.out.println("\n가격은 " + TicketDTO.STRING_DECIMAL_FORMAT.format(total) + " 원 입니다.");
        System.out.println("감사합니다.");
    }

    // 2. 티켓 발권의 지속 / 종료 여부 확인 메서드
    public void totalTest2() {
        PrintClass print = new PrintClass();
        while (true) {

            // 계산 실행
            totalTest();

            // 재시도 안내
            excute2();

            int pick = dto.getReTry();

            if (pick == 1) {
                continue;
            } else if (pick == 2) {
                print.closePrint();
                break;
            }
        }
        PrintList.ticketTotalPrint(dto);
    }
}
