package org.callback;

import lombok.extern.slf4j.Slf4j;

import java.util.logging.Logger;

@Slf4j
public class BookingTask extends Task{

    Logger logger = Logger.getLogger("booking-task-info");

    @Override
    public void booking() {
        logger.info("执行全部订票流程");
    }
}
