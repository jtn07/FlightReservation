package com.notyetdecided.flightbooking.Repositories;

import com.notyetdecided.flightbooking.Model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {

}
