package org.delegation;

public interface Baggage {

    void print(String msg); // 作为公共接口，各具体行李类可以在此实现不同的逻辑

    String getOwner();

}
