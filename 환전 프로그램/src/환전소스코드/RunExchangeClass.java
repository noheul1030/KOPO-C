package 환전소스코드;

public class RunExchangeClass {
    private OutputClass outClass = null;

    public RunExchangeClass() {
        outClass = new OutputClass();
    }

    private boolean checkBalanceUSD(int requestUSD) {
        if (requestUSD <= ConstValueClass.BALANCE_USD) {
            return true;
        } else {
            return false;
        }
    }

    private boolean checkBalanceEUR(int requestEUR) {
        if (requestEUR <= ConstValueClass.BALANCE_EUR) {
            return true;
        } else {
            return false;
        }
    }

    private boolean checkBalanceJPY(int requestJPY) {
        if (requestJPY <= ConstValueClass.BALANCE_JPY) {
            return true;
        } else {
            return false;
        }
    }

    public void changeToUSD(int moneyKOR) {
        double returnUSD;
        int returnRealUSD;
        int charge;

        returnUSD = moneyKOR / ConstValueClass.EX_USD;
        returnRealUSD = (int) returnUSD;
        if (checkBalanceUSD(returnRealUSD)) {
            outClass.outputResult(returnRealUSD);

            charge = (int) (moneyKOR - returnRealUSD * ConstValueClass.EX_USD);
            charge = (charge / 10) * 10;

            outClass.outputResultWon(charge);
            ConstValueClass.BALANCE_USD -= returnRealUSD;
        } else {
            outClass.printErrorMessage(ConstValueClass.ERR_BALANCE_USD);
        }
    }

    public void changeToEUR(int moneyKOR) {
        double returnEUR;
        int returnRealEUR;
        int charge;
        returnEUR = moneyKOR / ConstValueClass.EX_EUR;
        returnRealEUR = (int) returnEUR;

        if (checkBalanceEUR(returnRealEUR)) {
            outClass.outputResult(returnRealEUR);

            charge = (int) (moneyKOR - returnRealEUR * ConstValueClass.EX_EUR);
            charge = (charge / 10) * 10;

            outClass.outputResultWon(charge);
            ConstValueClass.BALANCE_EUR -= returnRealEUR;
        } else {
            outClass.printErrorMessage(ConstValueClass.ERR_BALANCE_EUR);
        }
    }

    public void changeToJPY(int moneyKOR) {
        double returnJPY;
        int returnRealJPY;
        int charge;
        returnJPY = moneyKOR / ConstValueClass.EX_JPY;
        returnRealJPY = (int) returnJPY;

        if (checkBalanceJPY(returnRealJPY)) {
            outClass.outputResult(returnRealJPY);

            charge = (int) (moneyKOR - returnRealJPY * ConstValueClass.EX_JPY);
            charge = (charge / 10) * 10;

            outClass.outputResultWon(charge);
            ConstValueClass.BALANCE_EUR -= returnRealJPY;
        } else {
            outClass.printErrorMessage(ConstValueClass.ERR_BALANCE_JPY);
        }
    }
}
