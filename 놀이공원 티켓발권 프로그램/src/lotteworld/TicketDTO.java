package lotteworld;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class TicketDTO {
	public static final int BUY_MAX_COUNT = 10;
	public static final int BUY_MIN_COUNT = 1;
	
	public static final int OLD_GENERATION = 1900;
	public static final int NEW_GENERATION = 2000;
	
	public static final int MIN_BABY = 1;
	public static final int MIN_CHILD = 3;
	public static final int MAX_CHILD = 12;
	public static final int MIN_TEEN = 13;
	public static final int MAX_TEEN = 18;
	public static final int MIN_ADULT = 19;
	public static final int MAX_ADULT = 64;
	
	public static final int BABY = 1;
	public static final int CHILD = 2;
	public static final int TEENAGE = 3;
	public static final int ADULT = 4;
	public static final int OLDMAN = 5;
	
	public static final String[] PERSON = {"����","���","û�ҳ�","����","����"};
	public static final String[] PREFERENTIAL_TREATMENT_PERSON = {"����","�����","����������","���ڳ�","�ӻ��"};
    public static final double[] PREFERENTIAL_TREATMENT_DISCOUNT = { 1.0, 0.5, 0.5, 0.7, 0.5 };
	public static LocalDate CURRENT_DATE = LocalDate.now();
	public static DecimalFormat STRING_DECIMAL_FORMAT = new DecimalFormat("###,###,###,###");

  
    private int ticketChoice, buyTicket, preferentialTreatment, reTry, personGroupNumber, totalPrice, totalSumPrice;
    private String residentRegistrationNumber;

    // 1.Ƽ�� ����
    public int getTicketChoice() {
        return ticketChoice;
    }

    public void setTicketChoice(int ticketChoice) {
        this.ticketChoice = ticketChoice;
    }

    // 2. �ֹε�Ϲ�ȣ
    public String getResidentRegistrationNumber() {
        return residentRegistrationNumber;
    }

    public void setResidentRegistrationNumber(String residentRegistrationNumber) {
        this.residentRegistrationNumber = residentRegistrationNumber;
    }

    // 3. �ֹ� ����
    public int getBuyTicketChoice() {
        return buyTicket;
    }

    public void setBuyTicketChoice(int buyTicket) {
        this.buyTicket = buyTicket;
    }

    // 4. ������ ����
    public int getPreferentialTreatment() {
        return preferentialTreatment;
    }

    public void setPreferentialTreatment(int preferentialTreatment) {
        this.preferentialTreatment = preferentialTreatment;
    }

    // 5. ����� ����
    public int getReTry() {
        return reTry;
    }

    public void setReTry(int reTry) {
        this.reTry = reTry;
    }
    
    // 6. �ΰ� �׷�
    public int getPersonGroupNumber() {
		return personGroupNumber;
	}

    public void setPersonGroupNumber(int personGroupNumber) {
		this.personGroupNumber = personGroupNumber;
	}
    
    // 7. �ݾ� ���
    public int getTotalPrice() {
		return totalPrice;
	}

    public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
    
    // 8. ���� ���� �ݾ� ���
    public int getTotalSumPrice() {
		return totalSumPrice;
	}

    public void setTotalSumPrice(int totalSumPrice) {
		this.totalSumPrice += totalSumPrice;
	}

    
}
