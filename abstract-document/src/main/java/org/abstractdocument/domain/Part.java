package org.abstractdocument.domain;

import org.abstractdocument.AbstractDocument;

import java.util.Map;

public class Part extends AbstractDocument
        implements HasArrivalTime, HasDepartureTime, HasArrivalCity, HasDepartureCity{
    protected Part(Map<String, Object> properties) {
        super(properties);
    }
}
