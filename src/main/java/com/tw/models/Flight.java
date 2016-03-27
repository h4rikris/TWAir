package com.tw.models;

public class Flight {

    private final String source;
    private final String destination;
    private final String model;

    public Flight(String source, String destination, String model) {
        this.source = source;
        this.destination = destination;
        this.model = model;
    }

    public Boolean isBetween(String source, String destination) {
        return this.source.equals(source) && this.destination.equals(destination);
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getModel() {
        return model;
    }

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!source.equals(flight.source)) return false;
        if (!destination.equals(flight.destination)) return false;
        return model.equals(flight.model);

    }

    @Override
    public int hashCode() {
        int result = source.hashCode();
        result = 31 * result + destination.hashCode();
        result = 31 * result + model.hashCode();
        return result;
    }
}
