package org.acyclicvisitor.configuration;

import org.acyclicvisitor.LandAirport;
import org.acyclicvisitor.SeaAirport;

public class FerryConfiguration implements SeasideAirportConfigVisitor {


    @Override
    public void visit(SeaAirport seaAirport) {
        System.out.println("正在配置给" + seaAirport.getName());
    }

    @Override
    public String desc() {
        return "轮渡枢纽";
    }
}
