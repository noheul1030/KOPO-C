package ȯ���ҽ��ڵ�;

public class OutputClass {
	
	private void printResultUSD(int returnRealUSD, 
								int outputUSD100, int outputUSD50, int outputUSD10,
								int outputUSD5, int outputUSD2, int outputUSD1) {
		System.out.println(returnRealUSD + " doller");
		System.out.println("100 �޷� ���� " 
							+ outputUSD100 + " �� ");
		System.out.println("50 �޷� ����" 
							+ outputUSD50 + " �� ");
		System.out.println("10 �޷� ���� " 
							+ outputUSD10 + " �� ");
		System.out.println("5 �޷� ���� " 
							+ outputUSD5 + " �� ");
		System.out.println("2 �޷� ���� " 
							+ outputUSD2 + " �� ");
		System.out.println("1 �޷� ���� " 
							+ outputUSD1 + " �� ");
	}
	
	private void printResultWon(int charge, 
								int returnWon1000, int returnWon500, int returnWon100,
								int returnWon50, int returnWon10) {
		System.out.println("\n�ܵ� = " 
				+ charge + " �� ");
		System.out.println("1000 �� ���� " 
						+ returnWon1000 + " �� ");
		System.out.println("500 �� ���� " 
						+ returnWon500  + " �� ");
		System.out.println("100 �� ���� " 
						+ returnWon100  + " �� ");
		System.out.println("50 �� ���� " 
						+ returnWon50 + " �� ");
		System.out.println("10 �� ���� " 
						+ returnWon10 + " �� ");		
	}
	
	public void printErrorMessage(int errorCode) {
		switch(errorCode) {
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
