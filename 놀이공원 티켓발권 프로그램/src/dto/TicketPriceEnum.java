package dto;

public enum TicketPriceEnum {

    BABY("BABY","����",15000, 15000),
	CHILD("CHILD","���",46000, 35000),
	TEENAGE("TEENAGE","û�ҳ�",52000, 41000),
	ADULT("ADULT","�� ��",59000, 47000),
	OLDMAN("OLDMAN","�� ��",46000, 35000);

	private final String personGroup_US;
	private final String personGroup_KR;
    private final int dayPrice;
    private final int nightPrice;

    // 1. ������
    private TicketPriceEnum(String personGroup_US, String personGroup_KR, int dayPrice, int nightPrice) {
    	this.personGroup_US = personGroup_US;
    	this.personGroup_KR = personGroup_KR;
        this.dayPrice = dayPrice;
        this.nightPrice = nightPrice;
    }
    
    // 2-1. ���ɺ� �׷�� get
    public String getPersonGroup_KR() {
    	return this.personGroup_KR;
    }
    
    // 2-2. ���ɺ� �׷�� get
    public String getPersonGroup_US() {
    	return this.personGroup_US;
    }

    // 3. �ְ��� �ݾ� get
    public int getDayPrice() {
        return this.dayPrice;
    }

    // 4. �߰��� �ݾ� get
    public int getNightPrice() {
        return this.nightPrice;
    }
}
