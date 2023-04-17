package 환전소스코드;

public class OutputClass {
	
	private void printResultUSD(int returnRealUSD, 
								int outputUSD100, int outputUSD50, int outputUSD10,
								int outputUSD5, int outputUSD2, int outputUSD1) {
		System.out.println(returnRealUSD + " doller");
		System.out.println("100 달러 지폐 " 
							+ outputUSD100 + " 장 ");
		System.out.println("50 달러 지폐" 
							+ outputUSD50 + " 장 ");
		System.out.println("10 달러 지폐 " 
							+ outputUSD10 + " 장 ");
		System.out.println("5 달러 지폐 " 
							+ outputUSD5 + " 장 ");
		System.out.println("2 달러 동전 " 
							+ outputUSD2 + " 개 ");
		System.out.println("1 달러 동전 " 
							+ outputUSD1 + " 개 ");
	}
	
	private void printResultWon(int charge, 
								int returnWon1000, int returnWon500, int returnWon100,
								int returnWon50, int returnWon10) {
		System.out.println("\n잔돈 = " 
				+ charge + " 원 ");
		System.out.println("1000 원 지폐 " 
						+ returnWon1000 + " 장 ");
		System.out.println("500 원 동전 " 
						+ returnWon500  + " 개 ");
		System.out.println("100 원 동전 " 
						+ returnWon100  + " 개 ");
		System.out.println("50 원 동전 " 
						+ returnWon50 + " 개 ");
		System.out.println("10 원 동전 " 
						+ returnWon10 + " 개 ");		
	}
	
	public void printErrorMessage(int errorCode) {
		switch(errorCode) {
			case ConstValueClass.ERR_BALANCE_USD:
				System.out.print("달러 ");
				break;
			case ConstValueClass.ERR_BALANCE_EUR:
				System.out.print("유로 ");
				break;
			case ConstValueClass.ERR_BALANCE_JPY:
				System.out.print("앤화 ");
				break;
		}
		System.out.println("보유 잔액이 부족합니다.");
	}
	public void outputResultUSD(int returnRealUSD) {
		int outputUSD100, outputUSD50, outputUSD10;
		int outputUSD5, outputUSD2, outputUSD1;
		
		outputUSD100 = (returnRealUSD / ConstValueClass.CHANGE_USD_100);
		outputUSD50 = ((returnRealUSD % ConstValueClass.CHANGE_USD_100)) / 50;
		outputUSD10 = (((returnRealUSD % ConstValueClass.CHANGE_USD_100)) % 50) / 10;
		outputUSD5 = ((((returnRealUSD % ConstValueClass.CHANGE_USD_100)) % 50) % 10) / 5;
		outputUSD2 = (((((returnRealUSD % ConstValueClass.CHANGE_USD_100)) % 50) % 10) % 5) / 2;
		outputUSD1 = ((((((returnRealUSD % ConstValueClass.CHANGE_USD_100)) % 50) % 10) % 5) % 2);
		
		printResultUSD(returnRealUSD, 
						outputUSD100, outputUSD50, outputUSD10, 
						outputUSD5, outputUSD2, outputUSD1);
		
	}
	public void outputResultEUR() {
		
	}
	public void outputResultJPY() {
		
	}
	public void outputResultWon(int charge) {
		int returnWon1000, returnWon500, returnWon100, returnWon50, returnWon10;
		returnWon1000 = charge / 1000;
		returnWon500 = (charge % 1000) / 500;
		returnWon100 = ((charge % 1000) % 500) / 100;
		returnWon50 = (((charge % 1000) % 500) % 100) / 50;
		returnWon10 = ((((charge % 1000) % 500) % 100) % 50) / 10;
		
		printResultWon(charge, 
						returnWon1000, returnWon500, returnWon100, 
						returnWon50, returnWon10);
	}
}
