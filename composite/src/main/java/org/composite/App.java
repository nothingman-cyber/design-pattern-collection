package org.composite;

public class App {

    // 一张联程机票由多个航程构成
    public static void main(String[] args) {
        var airTicket = new TicketPrinter();
        String[] cityStopsExample1 = new String[]{"Shanghai", "HongKong", "Tokyo"};
        String[] cityStopsExample2 = new String[]{"Hawaii", "LosAngeles", "NewYork"};


        airTicket.printNewTicket(cityStopsExample1).show();

        airTicket.printNewTicket(cityStopsExample2).show();
    }
}
