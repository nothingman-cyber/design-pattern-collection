package org.bridge;

public class DoNothing implements BaseProcess {

    @Override
    public void doProcess() {
        System.out.println("这个流程不做任何事情。");
    }
}
