package com.tw;

import com.tw.models.Flight;
import com.tw.services.FlightService;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.ui.Model;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class SearchPageTest {
    @Mock
    private Model model;

    @Mock
    private FlightService flightService;

    private SearchPage searchPage;

    @Before
    public void setUp() {
        searchPage = new SearchPage(flightService);
    }

    @Test
    public void shouldAddFlightsListAndLocationsToModel() throws Exception {

        searchPage.search(model, "Hyderabad", "Bengaluru");

        verify(model, times(1)).addAttribute(eq("flights"), anyCollectionOf(Flight.class));
        verify(model, times(1)).addAttribute(eq("sourceLocations"), anyCollectionOf(String.class));
        verify(model, times(1)).addAttribute(eq("destinationLocations"), anyCollectionOf(String.class));
    }

    @Test
    public void shouldSearchForFlightsBetweenGivenSourceAndDestinationLocations() {
        List<Flight> flights = Arrays.asList(new Flight("Hyderabad", "Bengaluru", "AirBus A380"));
        when(flightService.getFlights("Hyderabad", "Bengaluru")).thenReturn(flights);

        searchPage.search(model, "Hyderabad", "Bengaluru");

        verify(flightService, times(1)).getFlights("Hyderabad", "Bengaluru");
        verify(model).addAttribute("flights", flights);
    }
}