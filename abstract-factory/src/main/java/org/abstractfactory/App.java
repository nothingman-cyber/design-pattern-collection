package org.abstractfactory;

import lombok.extern.slf4j.Slf4j;

import static org.abstractfactory.Ticket.MachineMaker.MachineType.PLANE;
import static org.abstractfactory.Ticket.MachineMaker.MachineType.TRAIN;

@Slf4j
public class App implements Runnable{

    // 典型的例子：有三组类型同时有两种不同属性时，可以用抽象工厂来处理这个属性
    // 比如行程：可以是动车的行程(出发-到达-出发时间-到达时间)
    // 也可以是飞机的行程(出发-到达-出发时间-到达时间)

    private final Ticket ticket = new Ticket();


    public static void main(String[] args) {
        var app = new App();
        app.run();
    }

    @Override
    public void run() {
        create(TRAIN);
        create(PLANE);
    }

    public void create(final Ticket.MachineMaker.MachineType type) {
        final TicketMachine maker = Ticket.MachineMaker.makeMachine(type);
        ticket.setJourney(maker.generateItinerary());
    }

}
