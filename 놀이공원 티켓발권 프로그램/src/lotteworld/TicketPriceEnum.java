package lotteworld;

public enum TicketPriceEnum {

    BABY(15000, 15000), CHILD(46000, 35000), TEENAGE(52000, 41000), ADULT(59000, 47000), OLDMAN(46000, 35000);

    private final int dayPrice;
    private final int nightPrice;

    private TicketPriceEnum(int dayPrice, int nightPrice) {
        this.dayPrice = dayPrice;
        this.nightPrice = nightPrice;
    }

    public int getDayPrice() {
        return this.dayPrice;
    }

    public int getNightPrice() {
        return this.nightPrice;
    }
}
