package org.compositeentity;

import org.compositeentity.component.AircraftComponent;

import java.util.Arrays;

public abstract class AircraftComponentList<T> {

    AircraftComponent<T>[] components;

    public void setData(T... data) {
        for(int i = 0;i < data.length;i++) {
            components[i].setParams(data[i]);
        }
    }

    public T[] getData() {
        return (T[]) Arrays.stream(components).map(AircraftComponent::getParams).toArray();
    }
}
