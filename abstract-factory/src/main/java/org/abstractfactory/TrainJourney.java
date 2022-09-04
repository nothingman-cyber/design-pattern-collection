package org.abstractfactory;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TrainJourney implements Journey {

    private String departureCity;
    private String arrivalCity;
    private String departureTime;
    private String arrivalTime;


    @Override
    public String showJourney() {
        return "Journey in plane:" + departureCity + "-" + arrivalCity + "|"
                + departureTime + "-" + arrivalTime;
    }
}
