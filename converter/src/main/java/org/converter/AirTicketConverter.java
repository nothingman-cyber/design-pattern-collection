package org.converter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class AirTicketConverter extends Converter<AirTicketDto, AirTicket> {

    static DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public AirTicketConverter() {
        super(AirTicketConverter::getTicketFromDB, AirTicketConverter::sendTicketToDB);
    }


    private static AirTicket getTicketFromDB(AirTicketDto dto) {
        AirTicket ticket = new AirTicket();
        ticket.setFlag(dto.isAlive());
        String dCity = dto.getDepartureCity();
        String aCity = dto.getArrivalCity();
        ticket.setCityPair(dCity + "-" + aCity);



        ticket.setStartTime(LocalDateTime.parse(dto.getDepartureTime(), format));
        ticket.setEndTime(LocalDateTime.parse(dto.getArrivalTime(), format));

        return ticket;
    }

    private static AirTicketDto sendTicketToDB(AirTicket ticket) {
        AirTicketDto dto = new AirTicketDto();
        dto.setAlive(ticket.isFlag());
        String[] pair = ticket.getCityPair().split("-");
        dto.setDepartureCity(pair[0]);
        dto.setArrivalCity(pair[1]);

        dto.setDepartureTime(format.format(ticket.getStartTime()));
        dto.setArrivalTime(format.format(ticket.getEndTime()));

        return dto;
    }
}
