package org.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subscription {

    private String id;
    private String departureCity;
    private String arrivalCity;
    private String outboundDate;
    private String inboundDate;
    private String createTime;
}
