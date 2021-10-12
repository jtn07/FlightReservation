package com.notyetdecided.flightbooking.Controllers;


import com.notyetdecided.flightbooking.DTO.ReservationRequest;
import com.notyetdecided.flightbooking.Model.Flight;
import com.notyetdecided.flightbooking.Model.Reservation;
import com.notyetdecided.flightbooking.Repositories.FlightRepository;
import com.notyetdecided.flightbooking.Services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class ReservationController {

    @Autowired
    private ReservationService reservationService;
    @Autowired
    private FlightRepository flightRepository;

    @RequestMapping("/showCompleteReservation")
        public String showReservationPage(@RequestParam("flightId") long flightId, ModelMap modelMap) {
        Flight flight = flightRepository.getById(flightId);
        modelMap.addAttribute("flight",flight);
        return "completeReservation.html";
    }

    @RequestMapping(value = "completeReservation",method = RequestMethod.POST)
    private String completeReservation(@ModelAttribute("ReservationRequest")ReservationRequest reservationRequest,ModelMap modelMap){
        Reservation reservation=reservationService.bookFlight(reservationRequest);
        String msg="Reservation completed. Reservation id"+reservation.getId();
        modelMap.addAttribute("msg",msg);
        return"reservationConfirmation";
    }

}
