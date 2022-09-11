package org.delegation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WovenBag implements Baggage {

    private Identifier identifier;

    @Override
    public void print(String msg) {
        System.out.println(msg);
    }

    @Override
    public String getOwner() {
        return identifier.getBaggageOwner();
    }
}
