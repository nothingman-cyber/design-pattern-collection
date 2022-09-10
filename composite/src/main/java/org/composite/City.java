package org.composite;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class City extends TicketComposite {

    private String cityName;

    @Override
    protected void showThisBefore() {
        System.out.print(cityName);
    }
}
