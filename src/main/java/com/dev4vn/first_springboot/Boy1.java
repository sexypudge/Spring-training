package com.dev4vn.first_springboot;

public class Boy1 {

    private String name;

    public Boy1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Boy(" + this.name + ")";
    }
}
