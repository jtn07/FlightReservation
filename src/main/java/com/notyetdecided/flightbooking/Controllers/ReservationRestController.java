package com.notyetdecided.flightbooking.Controllers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.notyetdecided.flightbooking.DTO.ReservationUpdateRequest;
import com.notyetdecided.flightbooking.Model.Reservation;
import com.notyetdecided.flightbooking.Repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
public class ReservationRestController {

    @Autowired
     ReservationRepository reservationRepository;

    @RequestMapping("/reservations/{id}")
    public Reservation findReservation(@PathVariable("id") long id){
             return   reservationRepository.findById(id).get();
    }
    @RequestMapping("/reservations/update/{id}")
    private Reservation updateReservationRequest(@RequestBody ReservationUpdateRequest request){
        Reservation reservation=reservationRepository.getById(request.getId());
        reservation.setCheckedIn(true);
        reservation.setNoOfBags(request.getNoOfBags());
        return  reservationRepository.save(reservation);
    }
}
