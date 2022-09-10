package org.abstractdocument;

import lombok.extern.slf4j.Slf4j;
import org.abstractdocument.domain.Ticket;
import org.abstractdocument.domain.enums.Property;

import java.util.List;
import java.util.Map;


@Slf4j
public class App {

    public static void main(String[] args) {

        // 以一张机票为例，假设由(出发城市-到达城市)(出发时间-到达时间)(价格)构成
        var cityPairProperties = Map.of(
            Property.DEPARTURE_CITY.toString(), "Shanghai",
            Property.ARRIVAL_CITY.toString(), "Tokyo"
        );

        var timePairProperties = Map.of(
            Property.DEPARTURE_TIME.toString(), "2022-09-04 10:00:00",
            Property.ARRIVAL_TIME.toString(), "2022-09-04 15:00:00"
        );

        var ticketProperties = Map.of(
            Property.PRICE.toString(), "4000",
            Property.PARTS.toString(), List.of(cityPairProperties, timePairProperties)
        );

        var ticket = new Ticket(ticketProperties);
    }
}
