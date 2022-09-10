package org.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class TicketComposite {

    private final List<TicketComposite> children = new ArrayList<>();

    public void add(TicketComposite composite) {
        children.add(composite);
    }

    public int count() {
        return children.size();
    }

    protected void showThisBefore() {

    }

    protected void showThisAfter() {

    }

    public void show() {
        showThisBefore();
        children.forEach(TicketComposite::show);
        showThisAfter();
    }
}
