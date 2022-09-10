package org.command;

public class App {

    // 机票信息订阅系统，并允许上流服务执行操作或重做、撤销操作
    public static void main(String[] args) {

        var airTicketSubscriptionService = new AirTicketSubscriptionService();
        var soaInvokeMethod = new SoaInvokeMethod(airTicketSubscriptionService);

        airTicketSubscriptionService.initSub();
        airTicketSubscriptionService.showSub();

        soaInvokeMethod.makeNewSub();
        soaInvokeMethod.invokeSubService(airTicketSubscriptionService.addSub);
        airTicketSubscriptionService.showSub();

        soaInvokeMethod.invokeSubService(airTicketSubscriptionService.deleteSub);
        airTicketSubscriptionService.showSub();

        soaInvokeMethod.rollbackInvoke();
        airTicketSubscriptionService.showSub();

        soaInvokeMethod.rollbackInvoke();
        airTicketSubscriptionService.showSub();

        soaInvokeMethod.reExecuteInvoke();
        airTicketSubscriptionService.showSub();

        soaInvokeMethod.reExecuteInvoke();
        airTicketSubscriptionService.showSub();
    }
}
