package org.decorator;

public enum Page {

    BROWSE("浏览页"),
    BOOKING("订单页");

    String value;

    Page(String value) {
        this.value = value;
    }
}
