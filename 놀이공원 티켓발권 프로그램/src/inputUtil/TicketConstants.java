package inputUtil;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class TicketConstants {
	// 구매 건수 제한
	public static final int BUY_MAX_COUNT = 10;
	public static final int BUY_MIN_COUNT = 1;
	
	// 만나이 계산 초기화 년도
	public static final int OLD_GENERATION = 1900;
	public static final int NEW_GENERATION = 2000;

	// 연령별 최소값 최대값
	public static final int MIN_BABY = 1;
	public static final int MIN_CHILD = 3;
	public static final int MAX_CHILD = 12;
	public static final int MIN_TEEN = 13;
	public static final int MAX_TEEN = 18;
	public static final int MIN_ADULT = 19;
	public static final int MAX_ADULT = 64;

	// 연령그룹별 number
	public static final int BABY = 1;
	public static final int CHILD = 2;
	public static final int TEENAGE = 3;
	public static final int ADULT = 4;
	public static final int OLDMAN = 5;

	// 1 or 2 choice
	public static final int CHOICE_NUMBER_ONE = 1;
	public static final int CHOICE_NUMBER_TWO = 2;
	
	// Preferential treatment 
	public static final String[] PREFERENTIAL_TREATMENT_PERSON_KR = { "없음", "장애인", "국가유공자", "다자녀", "임산부" };
	public static final String[] PREFERENTIAL_TREATMENT_PERSON_EN = { "None", "Disabled Person", "Meritorious Persons", "a Multi-child Family", "Pregnant Woman" };
	public static final double[] PREFERENTIAL_TREATMENT_DISCOUNT = { 1.0, 0.5, 0.5, 0.7, 0.5 };
	
	// Language Choice
	public static final String KOREAN_COUNTRY_NUMBER = "1";
	public static final String ENGLISH_COUNTRY_NUMBER = "2";
	public static final String LANGUAGE_KOREAN = "ko";
    public static final String LANGUAGE_ENGLISH = "en";
    public static final int LANGUAGE_length = 7;
	
	public static LocalDate CURRENT_DATE = LocalDate.now();
	public static SimpleDateFormat DATA_FORMAT = new SimpleDateFormat("yyyyMMdd");
	public static DecimalFormat STRING_DECIMAL_FORMAT = new DecimalFormat("###,###,###,###");
}
