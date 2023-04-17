package 환전소스코드;

public class RunExchangeClass {
	private OutputClass outClass = null;
	
	public RunExchangeClass() {
		outClass = new OutputClass();
	}
	private boolean checkBalanceUSD(int requestUSD) {
		if(requestUSD <= ConstValueClass.BALANCE_USD) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean checkBalanceEUR(int requestEUR) {
		if(requestEUR <= ConstValueClass.BALANCE_EUR) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean checkBalanceJPY(int requestJPY) {
		if(requestJPY <= ConstValueClass.BALANCE_JPY) {
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
		returnRealUSD = (int)returnUSD;	
		if(checkBalanceUSD(returnRealUSD)) {
			outClass.outputResultUSD(returnRealUSD);
			
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
		returnRealEUR = (int)returnEUR;	
		
		if(checkBalanceEUR(returnRealEUR)) {
			System.out.println(returnRealEUR + " 유로\n");
			System.out.println("500 유로 지폐 " 
								+ (returnRealEUR / 500) + " 장 ");
			System.out.println("100 유로 지폐 " 
								+ ((returnRealEUR % 500) / 100) + " 장 ");
			System.out.println("50 유로 지폐 " 
								+ (((returnRealEUR % 500) % 100) / 50) + " 장 ");
			System.out.println("20 유로 지폐 " 
								+ ((((returnRealEUR % 500) % 100) % 50) / 20) + " 장 ");
			System.out.println("10 유로 지폐 " 
								+ (((((returnRealEUR % 500) % 100) % 50) % 20) / 10) + " 장 ");
			System.out.println("5 유로 지폐 " 
								+ ((((((returnRealEUR % 500) % 100) % 50) % 20) % 10) / 5) + " 장 ");																				
			System.out.println("2 유로 동전 " 
								+ ((returnRealEUR % 5) / 2) + " 개 ");
			System.out.println("1 유로 동전 " 
								+ (((returnRealEUR % 5)) % 2) + " 개 ");
						
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
		returnRealJPY = (int)returnJPY;		
		System.out.println(returnRealJPY + " 엔\n");
		System.out.println("10000 엔 지폐 " 
							+ (returnRealJPY / 10000) + " 장 ");
		System.out.println("5000 엔 지폐 " 
							+ ((returnRealJPY % 10000) / 5000) + " 장 ");
		System.out.println("1000 엔 지폐 " 
							+ (((returnRealJPY % 10000) % 5000) / 1000) + " 장 ");
		System.out.println("500 엔 동전 " 
							+ ((((returnRealJPY % 10000) % 5000) % 1000) / 500) + " 개 ");
		System.out.println("100 엔 동전 " 
							+ (((((returnRealJPY % 10000) % 5000) % 1000) % 500) / 100) + " 개 ");
						
		charge = (int) (moneyKOR - returnRealJPY * ConstValueClass.EX_JPY);
		charge = (charge / 10) * 10;  	
		
		outClass.outputResultWon(charge);		
	}
}



