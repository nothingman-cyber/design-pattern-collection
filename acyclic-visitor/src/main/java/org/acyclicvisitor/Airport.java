package org.acyclicvisitor;

import org.acyclicvisitor.configuration.AirportConfigurationVisitor;
import org.acyclicvisitor.configuration.SubwayConfiguration;

public interface Airport {

    void construct(AirportConfigurationVisitor visitor);
}
