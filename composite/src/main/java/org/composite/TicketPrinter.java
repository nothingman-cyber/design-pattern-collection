package org.composite;

import java.util.ArrayList;
import java.util.List;

public class TicketPrinter {

    public AirTicket printNewTicket(String[] cityStops) {

        List<Segment> segments = new ArrayList<>(cityStops.length - 1);

        for(int i = 0;i < cityStops.length - 1;i++) {
            String takeOffCity = cityStops[i];
            String takeOnCity = cityStops[i + 1];

            segments.add(new Segment(takeOffCity, takeOnCity));
        }

        return new AirTicket(segments);
    }
}
