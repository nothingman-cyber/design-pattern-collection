package org.factory;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

@RequiredArgsConstructor
@Getter
public enum CellPhoneType {

    SMART_PHONE(SmartPhone::new),
    ELDERLY_PHONE(ElderlyPhone::new);

    // 用 @RequiredArgsConstructor 自动装配构造函数
    private final Supplier<CellPhone> constructor;
}
