package org.acyclicvisitor;

public class AirportBuilder {
    public static Airport build(Location location, String name) {
        switch (location) {
            case SEA -> {
                return new SeaAirport(name);
            }
            case LAND -> {
                return new LandAirport(name);
            }
        }
        return null;
    }
}
