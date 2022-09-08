package org.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightSchedule {

    private CargoAircraft cargoAircraft;
    private MilitaryAircraft militaryAircraft;

    void schedule(MissionType type) {
        if (type == MissionType.CARGO) {
            cargoAircraft.cargoMissionStart();
        }
        if (type == MissionType.MILITARY) {
            militaryAircraft.specialMissionStart();
        }
    }
}
