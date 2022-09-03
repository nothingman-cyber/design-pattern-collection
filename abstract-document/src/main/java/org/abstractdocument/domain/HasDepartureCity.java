package org.abstractdocument.domain;

import org.abstractdocument.Document;
import org.abstractdocument.domain.enums.Property;

import java.util.Optional;

public interface HasDepartureCity extends Document {

    default Optional<String> getDepartureCity(){
        return Optional.ofNullable((String)get(Property.DEPARTURE_CITY.toString()));
    }
}
