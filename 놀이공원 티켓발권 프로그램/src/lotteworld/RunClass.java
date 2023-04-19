package lotteworld;

public class RunClass {

    private InputClass input = new InputClass();
    private TicketDTO dto = new TicketDTO();
    private PrintList printlist = new PrintList();

    // 1.�Է� �� set ���� �޼���
    public void insertRunFirst() {
        dto.setTicketChoice(input.ticketChoice());
        dto.setResidentRegistrationNumber(input.residentRegistrationNumber());
        dto.setBuyTicketChoice(input.buyTicketChoice());
        dto.setPreferentialTreatment(input.preferentialTreatmentChoice());
    }

    // 2. �Է� �� set ���� �޼���2
    public void insertRunSecond() {
        dto.setReTry(input.reTry());
    }

    // 3. Run ���� ���� �޼���
    public void startRunFirst() {
        TicketCalculator cal = new TicketCalculator();

        // Ƽ������ �Է¹ޱ�
        insertRunFirst();

        int total = cal.age(dto);
        dto.setTotalPrice(total);
        dto.setTotalSumPrice(total);

        printlist.saveData(dto);

        System.out.println("\n������ " + TicketDTO.STRING_DECIMAL_FORMAT.format(total) + " �� �Դϴ�.");
        System.out.println("�����մϴ�.");
    }

    // 4. Ƽ�� �߱��� ���� / ���� ���� Ȯ�� �޼���
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
