package org.bridge;

public class TicketProcess {

    BaseProcess baseProcess;

    public TicketProcess(BaseProcess baseProcess) {
        this.baseProcess = baseProcess;
    }

    public void doBooking() {
        System.out.println("定机票");
        baseProcess.doProcess();
    }
}
