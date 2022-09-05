package org.activeobject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class App implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(App.class.getName());

    private static final int NUM_CREATURES = 3;

    public static void main(String[] args) {
        var app = new App();
        app.run();
    }

    @Override
    public void run() {
        List<ActiveCreature> creatures = new ArrayList<>();
        try {
            for (int i = 0;i < NUM_CREATURES;i++) {
                creatures.add(new PlaneModel(PlaneModel.class.getSimpleName() + i, "MU00" + i));
                ((PlaneModel)creatures.get(i)).takeOff();
                ((PlaneModel)creatures.get(i)).takeOn();
            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            logger.error(e.getMessage());
            Thread.currentThread().interrupt();
        } finally {
            for (int i = 0;i < NUM_CREATURES;i++) {
                ((PlaneModel)creatures.get(i)).delisting(0);
            }
        }
    }
}
