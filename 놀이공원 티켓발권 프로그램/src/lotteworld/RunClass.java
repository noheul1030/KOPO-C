package lotteworld;

public class RunClass {

    private InputClass input = new InputClass();
    private TicketDTO dto = new TicketDTO();
    private PrintList printlist = new PrintList();

    // 1.입력 값 set 전달 메서드
    public void insertRunFirst() {
        dto.setTicketChoice(input.ticketChoice());
        dto.setResidentRegistrationNumber(input.residentRegistrationNumber());
        dto.setBuyTicketChoice(input.buyTicketChoice());
        dto.setPreferentialTreatment(input.preferentialTreatmentChoice());
    }

    // 2. 입력 값 set 전달 메서드2
    public void insertRunSecond() {
        dto.setReTry(input.reTry());
    }

    // 3. Run 실행 시작 메서드
    public void startRunFirst() {
        TicketCalculator cal = new TicketCalculator();

        // 티켓정보 입력받기
        insertRunFirst();

        int total = cal.age(dto);
        dto.setTotalPrice(total);
        dto.setTotalSumPrice(total);

        printlist.saveData(dto);

        System.out.println("\n가격은 " + TicketDTO.STRING_DECIMAL_FORMAT.format(total) + " 원 입니다.");
        System.out.println("감사합니다.");
    }

    // 4. 티켓 발권의 지속 / 종료 여부 확인 메서드
    public void startRunSecond() {
        PrintClass print = new PrintClass();
        while (true) {
            startRunFirst();

            insertRunSecond();

            int pick = dto.getReTry();

            if (pick == 1) {
                continue;
            } else if (pick == 2) {
                print.closePrint();
                break;
            }
        }
        printlist.ticketTotalPrint(dto);
    }
}
