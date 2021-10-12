package com.notyetdecided.flightbooking.Model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@Entity
@Table
public class Reservation extends AbstractEntity{

    private boolean checkedIn;
    @Column(nullable = false)
    private int noOfBags;

    @OneToOne
    private Passenger passenger;
    @OneToOne
    private Flight flight;

}
