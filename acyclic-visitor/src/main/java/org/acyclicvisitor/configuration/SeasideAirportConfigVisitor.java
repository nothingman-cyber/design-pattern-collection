package org.acyclicvisitor.configuration;

import org.acyclicvisitor.SeaAirport;

// 临海机场配置
public interface SeasideAirportConfigVisitor extends AirportConfigurationVisitor {

    void visit(SeaAirport seaAirport);
}
