package org.compositeentity;


import org.compositeentity.technicalparameter.Params;

import java.util.Arrays;

// 飞机由各种组件构成，而这些构件是有共同的技术参数的
public class App {

    static String[] body = new String[]{"空客子公司", "不复杂", "子公司外包机身", "650000000", "欧元"};
    static String[] controlSystem = new String[]{"空中客车", "一定复杂", "定制飞控系统", "500000000", "欧元"};
    static String[] engine = new String[]{"劳斯莱斯", "非常复杂", "特仑特(Trent)900", "1000000000", "欧元"};

    public static void main(String[] args) {
        A380 a380 = new A380();
        a380.initComponentBase();
        a380.setData(new Params(body), new Params(controlSystem), new Params(engine));
        Arrays.stream(a380.getData()).forEach(p -> System.out.println(p.desc()));
    }
}
