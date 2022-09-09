package org.bridge;

public class MetricsAndLog implements BaseProcess {


    @Override
    public void doProcess() {
        System.out.println("打断点，并打日志。");
    }
}
