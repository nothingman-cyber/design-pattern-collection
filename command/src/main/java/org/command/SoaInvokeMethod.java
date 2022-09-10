package org.command;

import lombok.extern.slf4j.Slf4j;

import java.util.Deque;
import java.util.LinkedList;
import java.util.function.Consumer;


public class SoaInvokeMethod {

    private final Deque<Consumer> undoStack = new LinkedList<>();
    private final Deque<Consumer> redoStack = new LinkedList<>();

    Subscription subscription;

    Service service;

    public SoaInvokeMethod(Service service) {
        this.service = service;
    }

    public void makeNewSub() {
        this.subscription = new Subscription("301010",
                "Hongkong", "Hawaii",
                "20221001", null,
                "20220908 15:00:00");
    }

    public void invokeSubService(Consumer consumer) {
        consumer.accept(subscription);
        undoStack.offerLast(consumer);
    }

    public void rollbackInvoke() {
        if (!undoStack.isEmpty()) {
            var previousMethod = undoStack.pollLast();
            service.setStatus(Status.ROLLBACK);
            redoStack.offerLast(previousMethod);
            previousMethod.accept(subscription);
        }
    }

    public void reExecuteInvoke() {
        if (!redoStack.isEmpty()) {
            var previousMethod = redoStack.pollLast();
            service.setStatus(Status.COMMIT);
            undoStack.offerLast(previousMethod);
            previousMethod.accept(subscription);
        }
    }
}
