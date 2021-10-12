package com.notyetdecided.flightbooking.Services;

import com.notyetdecided.flightbooking.DTO.ReservationRequest;
import com.notyetdecided.flightbooking.Model.Reservation;
import org.springframework.stereotype.Service;

@Service
public interface ReservationService {
    public Reservation bookFlight(ReservationRequest reservationRequest);
}
