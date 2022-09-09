package org.bridge;

public class App {

    /**
     * 有人定了一张机票，除了正常业务逻辑外，还需要打指标、打日志
     * @param args
     */
    public static void main(String[] args) {
        var ticketProcess = new TicketProcess(new MetricsAndLog());
        ticketProcess.doBooking();

        var ticketProcessWithoutOtherAttachment = new TicketProcess(new DoNothing());
        ticketProcessWithoutOtherAttachment.doBooking();
    }
}
