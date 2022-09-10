package org.composite;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Segment extends TicketComposite {

    private City takeOffCity;
    private City takeOnCity;

    public Segment(String takeOffCity, String takeOnCity) {
        this.takeOffCity = new City(takeOffCity);
        this.takeOnCity = new City(takeOnCity);
    }

    @Override
    protected void showThisBefore() {
        System.out.print("[Segment]");
        takeOffCity.showThisBefore();
        System.out.print("-");
        takeOnCity.showThisBefore();
        System.out.println();
    }
}
