package com.tw.services;

import com.tw.DataSource;
import com.tw.models.Flight;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlightService {

    public List<Flight> getFlights(String source, String destination) {
        List<Flight> flights = DataSource.flights.stream().filter(flight -> flight.isBetween(source, destination)).collect(Collectors.toList());
        return flights;
    }
}
