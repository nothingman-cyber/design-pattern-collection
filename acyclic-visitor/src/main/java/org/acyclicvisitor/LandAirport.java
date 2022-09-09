package org.acyclicvisitor;

import lombok.Data;
import org.acyclicvisitor.configuration.AirportConfigurationVisitor;
import org.acyclicvisitor.configuration.LandAirportConfigVisitor;
import org.acyclicvisitor.configuration.SeasideAirportConfigVisitor;
import org.acyclicvisitor.configuration.SubwayConfiguration;

@Data
public class LandAirport implements Airport {

    private String name;

    public LandAirport(String name) {
        this.name = name;
    }

    @Override
    public void construct(AirportConfigurationVisitor visitor) {
        String hubDesc = visitor.desc();
        System.out.println(name + "开始建设" + hubDesc);
        if (visitor instanceof LandAirportConfigVisitor) {
            ((LandAirportConfigVisitor) visitor).visit(this);
            System.out.println(hubDesc + "在" + name + "完工");
        } else {
            System.out.println(hubDesc + "不允许配置在" + name);
        }
    }
}
