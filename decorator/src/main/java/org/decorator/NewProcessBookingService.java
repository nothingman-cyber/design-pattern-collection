package org.decorator;

public class NewProcessBookingService implements WebsiteService {

    WebsiteService decoratedService;

    public NewProcessBookingService(WebsiteService service) {
        this.decoratedService = service;
    }


    @Override
    public void doPageJump(Page source, Page target) {
    }

    @Override
    public void doProcess() {
        System.out.println("跳转票方检索票证信息");
    }

    public void sureBookInBrowsePage() {
        if (decoratedService instanceof BookingService) {
            BookingService service = (BookingService)decoratedService;
            service.sureBookInBrowsePage();
            doProcess();
        } else {
            System.out.println("未检索到一期订单平台，执行跳转失败");
        }
    }

    public void intoBookingPage() {
        if (decoratedService instanceof BookingService) {
            BookingService service = (BookingService)decoratedService;
            service.intoBookingPage();
        } else {
            System.out.println("未检索到一期订单平台，执行跳转失败");
        }
    }
}
