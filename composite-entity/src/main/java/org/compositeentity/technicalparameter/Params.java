package org.compositeentity.technicalparameter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 技术参数
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Params {

    private String brand;
    private String complex;
    private String desc;
    private int price;
    private String currency;

    public String desc() {
        return String.format("由%s研发的%s，造价为%d(%s)，复杂度：%s",
                brand, desc,
                price, currency, complex);
    }

    public Params(String[] params) {
        this.brand = params[0];
        this.complex = params[1];
        this.desc = params[2];
        this.price = Integer.parseInt(params[3]);
        this.currency = params[4];
    }
}
