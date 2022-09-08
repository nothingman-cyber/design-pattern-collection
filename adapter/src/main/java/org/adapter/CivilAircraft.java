package org.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CivilAircraft {

    private String flightNo;
    private int numOfSeats;
    private int cargoTonnage;

    public void missionStart() {
        String desc = String.format("%s正在执行民航任务，座位数量%d个，运输吨位%d吨", flightNo, numOfSeats, cargoTonnage);
        System.out.println(desc);
    }
}
