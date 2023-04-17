package ȯ���ҽ��ڵ�;

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
			System.out.println(returnRealEUR + " ����\n");
			System.out.println("500 ���� ���� " 
								+ (returnRealEUR / 500) + " �� ");
			System.out.println("100 ���� ���� " 
								+ ((returnRealEUR % 500) / 100) + " �� ");
			System.out.println("50 ���� ���� " 
								+ (((returnRealEUR % 500) % 100) / 50) + " �� ");
			System.out.println("20 ���� ���� " 
								+ ((((returnRealEUR % 500) % 100) % 50) / 20) + " �� ");
			System.out.println("10 ���� ���� " 
								+ (((((returnRealEUR % 500) % 100) % 50) % 20) / 10) + " �� ");
			System.out.println("5 ���� ���� " 
								+ ((((((returnRealEUR % 500) % 100) % 50) % 20) % 10) / 5) + " �� ");																				
			System.out.println("2 ���� ���� " 
								+ ((returnRealEUR % 5) / 2) + " �� ");
			System.out.println("1 ���� ���� " 
								+ (((returnRealEUR % 5)) % 2) + " �� ");
						
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
		System.out.println(returnRealJPY + " ��\n");
		System.out.println("10000 �� ���� " 
							+ (returnRealJPY / 10000) + " �� ");
		System.out.println("5000 �� ���� " 
							+ ((returnRealJPY % 10000) / 5000) + " �� ");
		System.out.println("1000 �� ���� " 
							+ (((returnRealJPY % 10000) % 5000) / 1000) + " �� ");
		System.out.println("500 �� ���� " 
							+ ((((returnRealJPY % 10000) % 5000) % 1000) / 500) + " �� ");
		System.out.println("100 �� ���� " 
							+ (((((returnRealJPY % 10000) % 5000) % 1000) % 500) / 100) + " �� ");
						
		charge = (int) (moneyKOR - returnRealJPY * ConstValueClass.EX_JPY);
		charge = (charge / 10) * 10;  	
		
		outClass.outputResultWon(charge);		
	}
}



