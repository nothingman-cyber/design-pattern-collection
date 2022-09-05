package org.activeobject;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ActiveCreature {

    private static final Logger logger = LoggerFactory.getLogger(ActiveCreature.class.getName());

    private BlockingQueue<Runnable> requests;

    private String name;

    private Thread thread;

    private int status;

    public ActiveCreature(String name) {
        this.name = name;
        this.status = 0;
        this.requests = new LinkedBlockingQueue<>();
        thread = new Thread(() -> {
            boolean infinite = true;
            while (infinite) {
                try {
                    requests.take().run();
                } catch (InterruptedException e) {
                    if (this.status != 0) {
                        logger.error("Thread was interrupted.->{}", e.getMessage());
                    }
                    infinite = false;
                    Thread.currentThread().interrupt();
                }
            }
        });
        thread.start();
    }

    public BlockingQueue<Runnable> getRequests() {
        return requests;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Thread getThread() {
        return thread;
    }

    public int getStatus() {
        return status;
    }
}
