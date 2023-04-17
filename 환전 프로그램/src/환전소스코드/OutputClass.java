package 환전소스코드;

import java.util.ArrayList;
import java.util.List;

public class OutputClass {
	InputClass input = new InputClass();
	Cal cal = new Cal();
	
	int type = input.inputFromConsoleType();
	private List<Integer> calList = new ArrayList<Integer>();
	private List<String> calCall = new ArrayList<String>();
	
	
	// 3. 외화 잔돈 갯수 계산 메서드
	public void outputResult(int returnReal) {
		List<Integer> outputResult = new ArrayList<Integer>();
		
		int returnUSD = 0;
		
		switch(type) {
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
		
		for (int i = 0; i < calList.size(); i++) {
			if (i == 0) {
				outputResult.add(returnReal / calList.get(i));
				returnUSD = returnReal % calList.get(i);
			} else {
				if (calList.get(calList.size()) == 1) {
					outputResult.add(returnUSD % calList.get(i));
				} else {
					outputResult.add(returnUSD / calList.get(i));
					returnUSD = returnReal % calList.get(i);
				}
			}
		}
		printResult(returnReal,outputResult);
	}

	// 4. 원화 잔돈 갯수 계산 메서드
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

	// 3. 외화 잔돈 갯수 프린트 메서드 
	private void printResult(int returnRealUSD,List<Integer> outputResult) {
		switch (type) {
		case 1:
			System.out.println(returnRealUSD + " doller\n");
			for (int i = 0; i < outputResult.size(); i++) {
				System.out.printf("%d 달러 %d %s\n", calList.get(i), outputResult.get(i), calCall.get(i));
			}
			System.out.println();
			break;
		case 2:
			System.out.println(returnRealUSD + " 유로\n");
			for (int i = 0; i < outputResult.size(); i++) {
				System.out.printf("%d 유로 %d %s\n", calList.get(i), outputResult.get(i), calCall.get(i));
			}
			System.out.println();
			break;
		case 3:
			System.out.println(returnRealUSD + " 엔\n");
			for (int i = 0; i < outputResult.size(); i++) {
				System.out.printf("%d 엔 %d %s\n", calList.get(i), outputResult.get(i), calCall.get(i));
			}
			System.out.println();
			break;
		
		}
	}

	private void printResultWon(int charge, List<Integer> won) {

		System.out.println("\n잔돈 = " + charge + " 원\n");
		for (int i = 0; i < won.size(); i++) {
			System.out.printf("%d 원 %d %s\n", cal.Won_List.get(i), won.get(i), cal.Won_Call.get(i));
		}
		System.out.println();
	}

	public void printErrorMessage(int errorCode) {
		switch (errorCode) {
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

	
}
