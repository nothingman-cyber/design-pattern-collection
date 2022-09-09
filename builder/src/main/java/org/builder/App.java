package org.builder;

public class App {

    // 生成一张机票
    public static void main(String[] args) {
        var ticket1 = new FlightTicket.Builder(Field.INTERNATIONAL, "skyscanner")
                .withFlightNo("MS001")
                .withClassGrade(ClassGrade.ECONOMICS)
                .withCityPair(new String[]{"London", "Paris"})
                .withTimePair(new String[]{"20220909", "08:00:00", "10:00:00"})
                .build();

        var ticket2 = new FlightTicket.Builder(Field.DOMESTIC, "skyscanner")
                .withFlightNo("MS002")
                .withClassGrade(ClassGrade.ECONOMICS)
                .withCityPair(new String[]{"Shanghai", "Beijing"})
                .withTimePair(new String[]{"20220909", "07:00:00", "11:00:00"})
                .build();

        var ticket3 = new FlightTicket.Builder(Field.INTERNATIONAL, "skyscanner")
                .withFlightNo("MS003")
                .withClassGrade(ClassGrade.BUSINESS)
                .withCityPair(new String[]{"London", "New York"})
                .withTimePair(new String[]{"20220910", "06:00:00", "18:00:00"})
                .build();
    }
}
