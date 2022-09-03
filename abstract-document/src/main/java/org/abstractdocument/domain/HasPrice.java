package org.abstractdocument.domain;

import org.abstractdocument.Document;
import org.abstractdocument.domain.enums.Property;

import java.util.Optional;

public interface HasPrice extends Document {

    default Optional<String> getPrice(){
        return Optional.ofNullable((String)get(Property.PRICE.toString()));
    }
}
