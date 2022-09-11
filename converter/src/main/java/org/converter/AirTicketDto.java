package org.converter;

import lombok.Data;

@Data
public class AirTicketDto {

    private String departureCity;
    private String arrivalCity;
    private boolean alive;
    private String departureTime;
    private String arrivalTime;
}
