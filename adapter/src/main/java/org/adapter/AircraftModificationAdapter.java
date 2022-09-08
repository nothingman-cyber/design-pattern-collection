package org.adapter;

public class AircraftModificationAdapter implements CargoAircraft, MilitaryAircraft{

    private final CivilAircraft civilAircraft = new CivilAircraft("MS001", 80, 10);

    @Override
    public void cargoMissionStart() {
        String flightNo = civilAircraft.getFlightNo();
        String desc = String.format("--- %s作为民航机执行货机任务 ---", flightNo);
        System.out.println(desc);
        civilAircraft.setNumOfSeats(4);
        civilAircraft.setCargoTonnage(40);
        civilAircraft.missionStart();
    }

    @Override
    public void specialMissionStart() {
        String flightNo = civilAircraft.getFlightNo();
        String desc = String.format("--- %s作为民航机执行军事特别任务 ---", flightNo);
        System.out.println(desc);
        civilAircraft.setNumOfSeats(40);
        civilAircraft.setCargoTonnage(20);
        civilAircraft.missionStart();
    }
}
