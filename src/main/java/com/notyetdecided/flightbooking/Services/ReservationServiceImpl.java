package com.notyetdecided.flightbooking.Services;

import com.notyetdecided.flightbooking.DTO.ReservationRequest;
import com.notyetdecided.flightbooking.Model.Flight;
import com.notyetdecided.flightbooking.Model.Passenger;
import com.notyetdecided.flightbooking.Model.Reservation;
import com.notyetdecided.flightbooking.Repositories.FlightRepository;
import com.notyetdecided.flightbooking.Repositories.PassengerRepository;
import com.notyetdecided.flightbooking.Repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService{

    @Autowired
    private ReservationRepository reservationRepository;
    @Autowired
    private PassengerRepository passengerRepository;
    @Autowired
    private FlightRepository flightRepository;
    @Override
    public Reservation bookFlight(ReservationRequest reservationRequest) {

        long flightId = reservationRequest.getFlightId();
        Flight flight =flightRepository.getById(flightId);
        Passenger passenger=new Passenger();
        passenger.setFirstName(reservationRequest.getPassengerFirstName());
        passenger.setLastName(reservationRequest.getPassengerLastName());
        passenger.setMiddleName(reservationRequest.getPassengerLastName());
        passenger.setEmail(reservationRequest.getPassengerEmail());
        passenger.setPhone(reservationRequest.getPassengerPhone());
        Passenger savedPassenger= passengerRepository.save(passenger);
        Reservation reservation=new Reservation();
        reservation.setPassenger(savedPassenger);
        reservation.setFlight(flight);
        reservation.setCheckedIn(false);
        Reservation savedReservation= reservationRepository.save(reservation);

        return savedReservation;
    }
}
