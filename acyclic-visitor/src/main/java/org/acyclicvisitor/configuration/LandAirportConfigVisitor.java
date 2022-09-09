package org.acyclicvisitor.configuration;

import org.acyclicvisitor.LandAirport;

// 内陆机场配置
public interface LandAirportConfigVisitor extends AirportConfigurationVisitor {

    void visit(LandAirport landAirport);
}
