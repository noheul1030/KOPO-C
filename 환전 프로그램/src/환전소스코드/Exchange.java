package 환전소스코드;

public class Exchange {

    public static void main(String[] args) {

        InputClass inputClass = new InputClass();
        int moneyKOR = 0;

        while (true) {
            moneyKOR = inputClass.inputFromConsoleWon();

            RunExchangeClass runClass = new RunExchangeClass();

            switch (inputChangeType) {
            case ConstValueClass.CHANGE_TYPE_USD:
                runClass.changeToUSD(moneyKOR);
                break;
            case ConstValueClass.CHANGE_TYPE_EUR:
                runClass.changeToEUR(moneyKOR);
                break;
            case ConstValueClass.CHANGE_TYPE_JPY:
                runClass.changeToJPY(moneyKOR);
                break;
            }
        }
    }
}
