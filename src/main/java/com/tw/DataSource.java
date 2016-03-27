package com.tw;

import com.tw.models.Flight;

import java.util.Arrays;
import java.util.List;

public class DataSource {
    public static List<String> sourceLocations = Arrays.asList("Hyderabad", "Bengaluru");
    public static List<String> destinationLocations = Arrays.asList("Hyderabad", "Bengaluru");
    public static List<Flight> flights = Arrays.asList(new Flight("Hyderabad", "Bengaluru", "AirBus A380"),
            new Flight("Bengaluru", "Hyderabad", "AirBus A350"));
}
