package com.tw;

import com.tw.models.Flight;
import com.tw.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/search")
public class SearchPage {

    private FlightService flightService;

    @Autowired
    public SearchPage(FlightService flightService) {
        this.flightService = flightService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String search(Model model, @RequestParam(name = "sourceLocation") String source, @RequestParam(name = "destinationLocation") String destination) {
        List<Flight> flights = flightService.getFlights(source, destination);
        model.addAttribute("flights", flights);
        model.addAttribute("sourceLocations", DataSource.sourceLocations);
        model.addAttribute("destinationLocations", DataSource.destinationLocations);
        return "home";
    }
}
