package com.tw.services;

import com.tw.models.Flight;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.*;

public class FlightServiceTest {

    @Test
    public void shouldReturnFlightsBetweenSourceAndDestination() {
        FlightService flightService = new FlightService();


        List<Flight> flights =  flightService.getFlights("Hyderabad", "Bengaluru");

        List<Flight> expectedFlights = Arrays.asList(new Flight("Hyderabad", "Bengaluru", "AirBus A380"));
        assertEquals(expectedFlights, flights);
    }
}