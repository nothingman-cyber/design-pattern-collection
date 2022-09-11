package org.delegation;

// 委托设计模式是一种基本设计模式，又有诸多设计模式基于这之上形成
public class App {

    // 上飞机的行李有手提行李、大型行李箱、编织袋等，它们可以分为可自带行李和不可自带行李
    public static void main(String[] args) {
        Identifier i1 = new Identifier("John");
        Identifier i2 = new Identifier("Smith");

        var handHeldBaggageHinter = new BaggageHinter(new HandHeldBaggage(i1));
        var largeSuitcaseHinter = new BaggageHinter(new LargeSuitcase(i1));
        var wovenBagHinter = new BaggageHinter(new WovenBag(i2));

        handHeldBaggageHinter.print();
        largeSuitcaseHinter.print();
        wovenBagHinter.print();
    }
}
