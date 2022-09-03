package org.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

    public static void main(String[] args) {
        // 手机分为智能手机和老人机
        CellPhone iphone = CellPhoneFactory.getCellPhone(CellPhoneType.SMART_PHONE);
        CellPhone nokia = CellPhoneFactory.getCellPhone(CellPhoneType.ELDERLY_PHONE);
    }
}
