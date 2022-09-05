package org.activeobject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// 模拟一架飞机的行为，使用活动对象作为基类
public class PlaneModel extends ActiveCreature {

    private static final Logger logger = LoggerFactory.getLogger(PlaneModel.class.getName());

    private String flightNo;

    public PlaneModel(String name, String flightNo) {
        super(name);
        this.flightNo = flightNo;

    }

    public void takeOff() throws InterruptedException {
        getRequests().put(() -> {
            logger.info("{} take off!", this.flightNo);
            logger.info("{} finished take off!", this.flightNo);
        });
    }

    public void takeOn() throws InterruptedException {
        getRequests().put(() -> {
            logger.info("{} take on!", this.flightNo);
            logger.info("{} finished take on!", this.flightNo);
        });
    }

    public void delisting(int status) {
        setStatus(status);
        getThread().interrupt();
    }

    public int getStatus() {
        return super.getStatus();
    }
}
