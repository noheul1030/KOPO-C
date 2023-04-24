package DTO;

public enum TicketPriceEnum {

    BABY("영아",15000, 15000),
	CHILD("어린이",46000, 35000),
	TEENAGE("청소년",52000, 41000),
	ADULT("성 인",59000, 47000),
	OLDMAN("노 인",46000, 35000);

	private final String personGroup;
    private final int dayPrice;
    private final int nightPrice;

    // 1. 생성자
    private TicketPriceEnum(String personGroup,int dayPrice, int nightPrice) {
    	this.personGroup = personGroup;
        this.dayPrice = dayPrice;
        this.nightPrice = nightPrice;
    }
    
    // 2. 연령별 그룹명 get
    public String getPersonGroup() {
    	return this.personGroup;
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
