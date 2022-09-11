package org.delegation;

public class BaggageHinter {

    private Baggage baggage;

    public BaggageHinter(Baggage baggage) {
        this.baggage = baggage;
    }

    public void print() {
        String threshold = "";
        String enumType = "";
        if(baggage instanceof HandHeldBaggage) {
            enumType = "手提行李";
            threshold = "可托运或带入客舱";
        }
        if(baggage instanceof LargeSuitcase) {
            enumType = "大型行李箱";
            threshold = "可托运，不可带入客舱";
        }
        if(baggage instanceof WovenBag) {
            enumType = "编织袋";
            threshold = "可托运，不可带入客舱";
        }
        String hint = String.format("这是%s的行李，作为%s，%s", baggage.getOwner(), enumType, threshold);

        baggage.print(hint);
    }

}
