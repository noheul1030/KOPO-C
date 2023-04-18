package lotteworld;

public enum TicketDiscountEnum {

    DEFAULT(1.0), DISABLED_PERSON(0.5), NATIONAL_MERIT(0.5), MULTI_CHILD(0.7), PREGNANT_WOMAN(0.5);

    private final double preferentialDiscount;

    private TicketDiscountEnum(double preferentialDiscount) {
        this.preferentialDiscount = preferentialDiscount;
    }

    public double getPreferentialDiscount() {
        return this.preferentialDiscount;
    }
}
