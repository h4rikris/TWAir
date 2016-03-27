package com.tw.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class FlightTest {

    @Test
    public void shouldReturnTrueIfFlightIsBetweenSourceAndDestination() throws Exception {
        Flight flight = new Flight("Hyderabad", "Bengaluru", "AirBus A380");

        Boolean actualResult = flight.isBetween("Hyderabad", "Bengaluru");

        assertTrue(actualResult);
    }

    @Test
    public void shouldReturnFalseIfFlightIsNotBetweenSourceAndDestination() throws Exception {
        Flight flight = new Flight("Hyderabad", "Bengaluru", "AirBus A380");

        Boolean actualResult = flight.isBetween( "Bengaluru", "Hyderabad");

        assertFalse(actualResult);
    }
}