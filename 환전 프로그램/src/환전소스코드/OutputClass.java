package ȯ���ҽ��ڵ�;

import java.util.ArrayList;
import java.util.List;

public class OutputClass {
    private InputClass input = new InputClass();
    private Cal cal = new Cal();

    private int type = input.inputFromConsoleType();
    private List<Integer> calList = new ArrayList<Integer>();
    private List<String> calCall = new ArrayList<String>();

    // 3. ��ȯ�� ��ȭ ȭ����� ����Ʈ ȣ��
    public void list() {
        switch (type) {
        case 1:
            calList.addAll(cal.USD_List);
            calCall.addAll(cal.USD_Call);
            break;
        case 2:
            calList.addAll(cal.EUR_List);
            calCall.addAll(cal.EUR_Call);
            break;
        case 3:
            calList.addAll(cal.JPY_List);
            calCall.addAll(cal.JPY_Call);
            break;
        }
    }

    // 4. ��ȭ �ܵ� ���� ��� �޼���
    public void outputResult(int returnReal) {
        List<Integer> outputResult = new ArrayList<Integer>();

        int returnUSD = 0;

        for (int i = 0; i < calList.size(); i++) {
            if (i == 0) {
                outputResult.add(returnReal / calList.get(i));
                returnUSD = returnReal % calList.get(i);
            } else {
                if (calList.get(i) == 1) {
                    outputResult.add(returnUSD % calList.get(i - 1));
                } else {
                    outputResult.add(returnUSD / calList.get(i));
                    returnUSD = returnReal % calList.get(i);
                }
            }
        }
        printResult(returnReal, outputResult);
    }

    // 5. ��ȭ �ܵ� ���� ��� �޼���
    public void outputResultWon(int charge) {
        List<Integer> won = new ArrayList<Integer>();

        int returnWON = 0;

        for (int i = 0; i < cal.Won_List.size(); i++) {
            if (i == 0) {
                won.add(charge / cal.Won_List.get(i));
                returnWON = charge % cal.Won_List.get(i);
            } else {
                won.add(returnWON / cal.Won_List.get(i));
                returnWON = charge % cal.Won_List.get(i);
            }
        }
        printResultWon(charge, won);
    }

    // 6. ��ȭ �ܵ� ���� ����Ʈ �޼���
    private void printResult(int returnRealUSD, List<Integer> outputResult) {
        System.out.printf("%d %s\n", returnRealUSD, cal.changeMoney_type.get(type));

        for (int i = 0; i < outputResult.size(); i++) {
            System.out.printf("%d %s %d %s\n", calList.get(i), cal.changeMoney_type.get(type), outputResult.get(i),
                    calCall.get(i));
        }
        System.out.println();

    }

    // 7. ��ȭ �ܵ� ���� ����Ʈ �޼���
    private void printResultWon(int charge, List<Integer> won) {
        System.out.println("\n�ܵ� = " + charge + " ��\n");

        for (int i = 0; i < won.size(); i++) {
            System.out.printf("%d �� %d %s\n", cal.Won_List.get(i), won.get(i), cal.Won_Call.get(i));
        }
        System.out.println();
    }

    //
    public void printErrorMessage(int errorCode) {
        switch (errorCode) {
        case ConstValueClass.ERR_BALANCE_USD:
            System.out.print("�޷� ");
            break;
        case ConstValueClass.ERR_BALANCE_EUR:
            System.out.print("���� ");
            break;
        case ConstValueClass.ERR_BALANCE_JPY:
            System.out.print("��ȭ ");
            break;
        }
        System.out.println("���� �ܾ��� �����մϴ�.");
    }

}
