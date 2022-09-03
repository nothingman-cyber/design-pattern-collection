package org.abstractdocument.domain;


import org.abstractdocument.AbstractDocument;

import java.util.Map;

public class Ticket extends AbstractDocument implements HasPrice, HasParts {
    public Ticket(Map<String, Object> properties) {
        super(properties);
    }
}
