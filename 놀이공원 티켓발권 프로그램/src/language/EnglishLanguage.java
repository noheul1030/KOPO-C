package language;

import dto.TicketDTO;
import inputUtil.TicketConstants;

public class EnglishLanguage {
	
	// English
	public static void ticketChoicePrint() {
		System.out.println("Please Input ticket type choice.  \n" + "1. Day \n" + "2. Night");
	}
	
	public static void residentRegistrationNumberPrinEnglish() {
		System.out.println("\nPlease Input your RegistrationNumber. ( ex : 123456-1234567 ) : ");
	}
	
	public static void buyTicketChoicePrint() {
		System.out.println("\nPlease Input buy Ticket number. (MAX 10): ");
	}
	
	public static void preferentialTreatmentChoicePrint() {
		System.out.println("\nPlease Input the preferentialTreatment number choice. \n" + "1. None \n" + "2. disabled person \n"
				+ "3. meritorious persons \n" + "4. a multi-child family \n" + "5. gravida");
	}
	
	public static void errorPrint() {
		System.out.println("\n##### Error. Please retry #####");
	}
	
	public static void totalRePrint() {
		System.out.println("\ndo you ReTry Ticket system? \n" + "1. ReTry \n" + "2. End");
	}
	
	public static void closePrint() {
		System.out.println("\n***** Ticket system End. Thanks you. *****");
	}
	
	public static void ticketTotalHeadPrint() {
		System.out.println();
		System.out.println("============================= LOTTE WORLD =============================");
		System.out.printf("%5s%9s%9s%9s%14s\n", "Type", "Group", "Count", "Price", "preferentialTreatment");
		System.out.println("=======================================================================");
	}
	
//	public static void ticketTotalMiddlePrintEnglish(OrderListDTO order) {
//		System.out.printf("%5s", order.getTicketType());
//		System.out.printf("%9s", order.getGroup());
//		System.out.printf("%10s", "X  " + order.getTicketCount());
//		System.out.printf("%12sWON", TicketConstants.STRING_DECIMAL_FORMAT.format(order.getTotalPrice()));
//		System.out.printf("%4s%8s\n", " ", "* " + order.getPreferentialTreatment());
//	}
	
	public static void ticketTotalTailPrint(TicketDTO dto) {
		System.out.println("===============================================================");
		System.out.println();
		System.out.printf("***** Total Price : %s Won. *****",
				TicketConstants.STRING_DECIMAL_FORMAT.format(dto.getTotalSumPrice()));
	}

}
