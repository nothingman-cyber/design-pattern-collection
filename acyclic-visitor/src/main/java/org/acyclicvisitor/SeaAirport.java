package org.acyclicvisitor;

import lombok.Data;
import org.acyclicvisitor.configuration.AirportConfigurationVisitor;
import org.acyclicvisitor.configuration.SeasideAirportConfigVisitor;

@Data
public class SeaAirport implements Airport {

    private String name;

    public SeaAirport(String name) {
        this.name = name;
    }

    @Override
    public void construct(AirportConfigurationVisitor visitor) {
        String hubDesc = visitor.desc();
        System.out.println(name + "开始建设" + hubDesc);
        if (visitor instanceof SeasideAirportConfigVisitor) {
            ((SeasideAirportConfigVisitor) visitor).visit(this);
            System.out.println(hubDesc + "在" + name + "完工");
        } else {
            System.out.println(hubDesc + "不允许配置在" + name);
        }
    }
}
