package org.abstractdocument.domain;

import org.abstractdocument.Document;
import org.abstractdocument.domain.enums.Property;

import java.util.Optional;

public interface HasArrivalCity extends Document {

    default Optional<String> getArrivalCity() {
        return Optional.ofNullable((String)get(Property.ARRIVAL_CITY.toString()));
    }
}
