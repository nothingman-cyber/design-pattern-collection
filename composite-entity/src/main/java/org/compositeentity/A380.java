package org.compositeentity;

import org.compositeentity.component.AircraftBody;
import org.compositeentity.component.AircraftComponent;
import org.compositeentity.component.AircraftControlSystem;
import org.compositeentity.component.AircraftEngine;
import org.compositeentity.technicalparameter.Params;

import java.util.Arrays;

public class A380 extends AircraftComponentList<Params> {

    @Override
    public Params[] getData() {
        return new Params[]{
            components[0].getParams(),
            components[1].getParams(),
            components[2].getParams()
        };
    }

    public void initComponentBase() {
        components = new AircraftComponent[]{
            new AircraftBody(),
            new AircraftControlSystem(),
            new AircraftEngine()
        };
    }
}
