package ȯ���ҽ��ڵ�;

import java.util.Scanner;

public class InputClass {
	private Scanner sc = null;
	
	public InputClass() {
		sc = new Scanner(System.in);
	}
	
	public int inputFromConsoleWon() {
		int moneyKOR;
		System.out.println("��ȭ �Է� : ");	
		moneyKOR = sc.nextInt();
		return moneyKOR;
	}
	public int inputFromConsoleType() {
		int inputChangeType;
		System.out.println("Which money do you want?\n"
				+ "1.USD\n\n"  
				+ "2.EUR\n\n"
				+ "3.JPY\n\n"
				+ "0.Exit");
		inputChangeType = sc.nextInt();
		return inputChangeType;
	}
}
