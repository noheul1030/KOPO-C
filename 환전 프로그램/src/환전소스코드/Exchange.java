package 환전소스코드;

public class Exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int moneyKOR = 0;
		int inputChangeType = 0;
		InputClass inputClass = new InputClass();
		do {
			moneyKOR = inputClass.inputFromConsoleWon();
			inputChangeType = inputClass.inputFromConsoleType();
			
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
		}while (inputChangeType != 0);												
	}
}






