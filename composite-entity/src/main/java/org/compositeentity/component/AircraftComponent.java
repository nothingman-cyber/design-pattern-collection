package org.compositeentity.component;

public abstract class AircraftComponent<T> {

    T params;

    public void setParams(T params) {
        this.params = params;
    }

    public T getParams() {
        return this.params;
    }
}
