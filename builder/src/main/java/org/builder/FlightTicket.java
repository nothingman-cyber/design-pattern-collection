package org.builder;

public class FlightTicket {

    Field field;
    String website;
    String flightNo;
    ClassGrade classGrade;
    String[] cityPair;
    String date;
    String[] timePair;

    public FlightTicket(Builder builder) {
        this.field = builder.field;
        this.website = builder.website;
        this.flightNo = builder.flightNo;
        this.classGrade = builder.classGrade;
        this.cityPair = builder.cityPair;
        this.date = builder.date;
        this.timePair = builder.timePair;
    }

    public static class Builder {

        Field field;
        String website;
        String flightNo;
        ClassGrade classGrade;
        String[] cityPair;
        String date;
        String[] timePair;

        public Builder(Field field, String website) {
            this.field = field;
            this.website = website;
        }

        public Builder withFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }

        public Builder withClassGrade(ClassGrade classGrade) {
            this.classGrade = classGrade;
            return this;
        }

        public Builder withCityPair(String[] cityPair) {
            this.cityPair = cityPair;
            return this;
        }

        public Builder withTimePair(String[] timeSetting) {
            this.date = timeSetting[0];
            this.timePair = new String[]{timeSetting[1], timeSetting[2]};
            return this;
        }

        public FlightTicket build() {
            return new FlightTicket(this);
        }
    }
}
