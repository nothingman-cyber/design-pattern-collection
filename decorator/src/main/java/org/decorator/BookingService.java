package org.decorator;
public class BookingService implements WebsiteService {


    @Override
    public void doPageJump(Page source, Page target) {
        System.out.println("从"+source.value+"跳转至"+target.value);
    }

    @Override
    public void doProcess() {

    }

    public void sureBookInBrowsePage() {
        doPageJump(Page.BROWSE, Page.BOOKING);
    }

    public void intoBookingPage() {
        System.out.println("进入" + Page.BOOKING.value);
    }
}
