package org.callback;

import lombok.extern.slf4j.Slf4j;

import java.util.logging.Logger;

@Slf4j
public class App {

    private static Logger logger = Logger.getLogger("app-info");

    // 订阅机票后通知一声
    public static void main(String[] args) {
        var bookingTask = new BookingTask();
        bookingTask.bookingWith(() -> logger.info("Booking successful, now start processing next job."));
    }
}
