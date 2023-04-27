package dto;

public enum TicketPriceEnum {

    BABY("BABY","영아",15000, 15000),
	CHILD("CHILD","어린이",46000, 35000),
	TEENAGE("TEENAGE","청소년",52000, 41000),
	ADULT("ADULT","성 인",59000, 47000),
	OLDMAN("OLDMAN","노 인",46000, 35000);

	private final String personGroup_US;
	private final String personGroup_KR;
    private final int dayPrice;
    private final int nightPrice;

    // 1. 생성자
    private TicketPriceEnum(String personGroup_US, String personGroup_KR, int dayPrice, int nightPrice) {
    	this.personGroup_US = personGroup_US;
    	this.personGroup_KR = personGroup_KR;
        this.dayPrice = dayPrice;
        this.nightPrice = nightPrice;
    }
    
    // 2-1. 연령별 그룹명 get
    public String getPersonGroup_KR() {
    	return this.personGroup_KR;
    }
    
    // 2-2. 연령별 그룹명 get
    public String getPersonGroup_US() {
    	return this.personGroup_US;
    }

    // 3. 주간권 금액 get
    public int getDayPrice() {
        return this.dayPrice;
    }

    // 4. 야간권 금액 get
    public int getNightPrice() {
        return this.nightPrice;
    }
}
