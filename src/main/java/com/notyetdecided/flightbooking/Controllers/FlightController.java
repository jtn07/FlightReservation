package com.notyetdecided.flightbooking.Controllers;

import com.notyetdecided.flightbooking.Model.Flight;
import com.notyetdecided.flightbooking.Repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
public class FlightController {

    @Autowired
    FlightRepository flightRepository;

    @PostMapping(("/findFlights"))
    private String findFlights(@RequestParam("from") String from, @RequestParam("to") String to, @RequestParam("departureDate")@DateTimeFormat(pattern="yyyy-MM-dd") Date departureDate, ModelMap modelMap){
        List<Flight> flights=flightRepository.findAllFlights(from,to,departureDate);
        modelMap.addAttribute("flights",flights);
        return "displayFlights";
    }

}
