package inputUtil;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class TicketConstants {
	// ���� �Ǽ� ����
	public static final int BUY_MAX_COUNT = 10;
	public static final int BUY_MIN_COUNT = 1;
	
	// ������ ��� �ʱ�ȭ �⵵
	public static final int OLD_GENERATION = 1900;
	public static final int NEW_GENERATION = 2000;

	// ���ɺ� �ּҰ� �ִ밪
	public static final int MIN_BABY = 1;
	public static final int MIN_CHILD = 3;
	public static final int MAX_CHILD = 12;
	public static final int MIN_TEEN = 13;
	public static final int MAX_TEEN = 18;
	public static final int MIN_ADULT = 19;
	public static final int MAX_ADULT = 64;

	// ���ɱ׷캰 number
	public static final int BABY = 1;
	public static final int CHILD = 2;
	public static final int TEENAGE = 3;
	public static final int ADULT = 4;
	public static final int OLDMAN = 5;

	// 1 or 2 choice
	public static final int CHOICE_NUMBER_ONE = 1;
	public static final int CHOICE_NUMBER_TWO = 2;
	
	// TICKET TYPE
	public static final String DAY_TICKET = "���ϱ�";
	public static final String NIGHT_TICKET = "�߰���";

	// Preferential treatment 
	public static final String[] PREFERENTIAL_TREATMENT_PERSON = { "����", "�����", "����������", "���ڳ�", "�ӻ��" };
	public static final double[] PREFERENTIAL_TREATMENT_DISCOUNT = { 1.0, 0.5, 0.5, 0.7, 0.5 };
//	public static final 
	
	public static LocalDate CURRENT_DATE = LocalDate.now();
	public static DecimalFormat STRING_DECIMAL_FORMAT = new DecimalFormat("###,###,###,###");
}
