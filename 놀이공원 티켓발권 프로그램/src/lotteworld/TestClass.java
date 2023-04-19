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

    // 1. Test ��� ���� �޼���
    public void totalTest() {
        TicketCalculator cal = new TicketCalculator();

        // Ƽ������ �Է¹ޱ�
        excute();

        int total = cal.age(dto);
        dto.setTotalPrice(total);
        dto.setTotalSumPrice(total);
        
        PrintList.saveData(dto);
        
        System.out.println("\n������ " + TicketDTO.STRING_DECIMAL_FORMAT.format(total) + " �� �Դϴ�.");
        System.out.println("�����մϴ�.");
    }

    // 2. Ƽ�� �߱��� ���� / ���� ���� Ȯ�� �޼���
    public void totalTest2() {
        PrintClass print = new PrintClass();
        while (true) {

            // ��� ����
            totalTest();

            // ��õ� �ȳ�
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
