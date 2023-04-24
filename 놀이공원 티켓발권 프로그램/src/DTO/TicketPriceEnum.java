package DTO;

public enum TicketPriceEnum {

    BABY("����",15000, 15000),
	CHILD("���",46000, 35000),
	TEENAGE("û�ҳ�",52000, 41000),
	ADULT("�� ��",59000, 47000),
	OLDMAN("�� ��",46000, 35000);

	private final String personGroup;
    private final int dayPrice;
    private final int nightPrice;

    // 1. ������
    private TicketPriceEnum(String personGroup,int dayPrice, int nightPrice) {
    	this.personGroup = personGroup;
        this.dayPrice = dayPrice;
        this.nightPrice = nightPrice;
    }
    
    // 2. ���ɺ� �׷�� get
    public String getPersonGroup() {
    	return this.personGroup;
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
