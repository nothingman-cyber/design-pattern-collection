package org.converter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class App {

    // 把机票实体转换成机票DTO，好方便存入数据库
    public static void main(String[] args) {
        Converter<AirTicketDto, AirTicket> databaseConverter = new AirTicketConverter();

        AirTicket ticket0 = new AirTicket("HongKong-Tokyo", LocalDateTime.now(), LocalDateTime.now(), true);
        AirTicket ticket1 = new AirTicket("Shanghai-Beijing", LocalDateTime.now(), LocalDateTime.now(), false);

        AirTicketDto dto0 = databaseConverter.convertEntity2Dto(ticket0);
        AirTicketDto dto1 = databaseConverter.convertEntity2Dto(ticket1);

        List<AirTicket> tickets = new ArrayList<>(2);
        tickets.add(ticket0);
        tickets.add(ticket1);

        List<AirTicketDto> dtos = databaseConverter.convertEntity2Dto(tickets);
        tickets = databaseConverter.convertDto2Entity(dtos);

    }
}
