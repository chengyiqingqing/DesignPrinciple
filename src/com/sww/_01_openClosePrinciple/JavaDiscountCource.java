package com.sww._01_openClosePrinciple;

public class JavaDiscountCource extends JavaCource {

    public JavaDiscountCource(String id, String name, int price) {
        super(id, name, price);
    }

    public int getOriginPrice() {
        return super.getPrice();
    }

    public int getDiscountPrice() {
        return (int) (super.getPrice() * 0.8);
    }

}
