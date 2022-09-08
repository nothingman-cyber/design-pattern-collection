package org.adapter;


/*
    有一架民用客机，现在需要改造成货机或者军机使用
 */
public class App {

    public static void main(String[] args) {
        var schedule = new FlightSchedule(new AircraftModificationAdapter(), new AircraftModificationAdapter());
        schedule.schedule(MissionType.CARGO);
        schedule.schedule(MissionType.MILITARY);
    }
}
