package org.decorator;

public class App {

    // 正常流程：购票时从浏览页进入订单页
    // 现在票方希望增加一个流程，在购票浏览页进入订单页前，新增一个票证校验
    public static void main(String[] args) {

        var bookingService = new BookingService();
        bookingService.sureBookInBrowsePage();
        bookingService.intoBookingPage();

        System.out.println();

        var bookingServiceV2 = new NewProcessBookingService(bookingService);
        bookingServiceV2.sureBookInBrowsePage();
        bookingServiceV2.intoBookingPage();

    }
}
