package org.factory;

public class CellPhoneFactory {

    public static CellPhone getCellPhone(CellPhoneType type) {
        return type.getConstructor().get();
    }
}
