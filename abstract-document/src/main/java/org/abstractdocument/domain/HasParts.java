package org.abstractdocument.domain;

import org.abstractdocument.Document;
import org.abstractdocument.domain.enums.Property;

import java.util.Optional;
import java.util.stream.Stream;

public interface HasParts extends Document {

    default Stream<Part> getParts(){
        return children(Property.PARTS.toString(), Part::new);
    }
}
