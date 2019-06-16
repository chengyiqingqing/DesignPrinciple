package com.sww._01_openClosePrinciple;

public class JavaCource implements ICourse {

    private String id;
    private String name;
    private int price;

    public JavaCource(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
