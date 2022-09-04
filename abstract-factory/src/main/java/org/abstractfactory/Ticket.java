package org.abstractfactory;


import lombok.Data;

@Data
public class Ticket {

    private Journey journey;


    public static class MachineMaker {

        public enum MachineType {
            TRAIN, PLANE
        }


        public static TicketMachine makeMachine(MachineType type) {
            switch (type) {
                case TRAIN:
                    return new TrainTicketMachine();
                case PLANE:
                    return new PlaneTicketMachine();
                default:
                    throw new IllegalArgumentException("type not supported.");
            }
        }
    }
}
