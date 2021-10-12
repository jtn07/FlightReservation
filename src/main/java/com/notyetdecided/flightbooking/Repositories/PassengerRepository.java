package com.notyetdecided.flightbooking.Repositories;

import com.notyetdecided.flightbooking.Model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger,Long> {

}
