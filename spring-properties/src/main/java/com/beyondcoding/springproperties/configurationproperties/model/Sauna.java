package com.beyondcoding.springproperties.configurationproperties.model;

public class Sauna {

    private int availableSeats;
    private int temperature;

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Sauna{" +
                "availableSeats=" + availableSeats +
                ", temperature=" + temperature +
                '}';
    }
}
