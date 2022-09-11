package org.converter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AirTicket {

    private String cityPair;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private boolean flag;
}
