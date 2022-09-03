package org.abstractdocument.domain;

import org.abstractdocument.Document;
import org.abstractdocument.domain.enums.Property;

import java.util.Optional;

public interface HasDepartureTime extends Document {

    default Optional<String> getDepartureTime(){
        return Optional.ofNullable((String)get(Property.DEPARTURE_TIME.toString()));
    }
}
