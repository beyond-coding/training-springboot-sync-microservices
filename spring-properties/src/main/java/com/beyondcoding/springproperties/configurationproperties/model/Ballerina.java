package com.beyondcoding.springproperties.configurationproperties.model;

public class Ballerina {

    private String name;
    private int performance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    @Override
    public String toString() {
        return "Ballerina{" +
                "name='" + name + '\'' +
                ", performance=" + performance +
                '}';
    }
}