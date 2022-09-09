package org.acyclicvisitor;

import org.acyclicvisitor.configuration.FerryConfiguration;
import org.acyclicvisitor.configuration.SubwayConfiguration;

public class App {

    // 临海机场可以作为轨道交通中枢和渡轮中枢，但内陆机场只能作为轨道交通中枢
    // 前者典型的有香港国际机场，后者典型的有上海虹桥机场
    public static void main(String[] args) {
        var airportNearSea = AirportBuilder.build(Location.SEA, "香港国际机场");
        var airportOverland = AirportBuilder.build(Location.LAND, "上海虹桥机场");

        var trainHubConfiguration = new SubwayConfiguration();
        var ferryHubConfiguration = new FerryConfiguration();

        airportNearSea.construct(trainHubConfiguration);
        airportNearSea.construct(ferryHubConfiguration);
        airportOverland.construct(trainHubConfiguration);
        airportOverland.construct(ferryHubConfiguration); // 这个会报错
    }
}
