package org.acyclicvisitor.configuration;

import org.acyclicvisitor.LandAirport;
import org.acyclicvisitor.SeaAirport;

public class SubwayConfiguration implements AllAirportConfigVisitor {



    @Override
    public void visit(LandAirport landAirport) {
        System.out.println("正在配置给" + landAirport.getName());
    }

    @Override
    public void visit(SeaAirport seaAirport) {
        System.out.println("正在配置给" + seaAirport.getName());
    }

    @Override
    public String desc() {
        return "捷运枢纽";
    }
}
