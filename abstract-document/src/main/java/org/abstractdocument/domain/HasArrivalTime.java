package org.abstractdocument.domain;

import org.abstractdocument.Document;
import org.abstractdocument.domain.enums.Property;

import java.util.Optional;

public interface HasArrivalTime extends Document {

    default Optional<String> getArrivalTime() {
        return Optional.ofNullable((String)get(Property.ARRIVAL_TIME.toString()));
    }
}
