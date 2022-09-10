package org.composite;

import java.util.List;

public class AirTicket extends TicketComposite{
    public AirTicket(List<Segment> segments) {
        segments.forEach(this::add);
    }

    @Override
    protected void showThisAfter() {
        System.out.print("\n");
    }
}
