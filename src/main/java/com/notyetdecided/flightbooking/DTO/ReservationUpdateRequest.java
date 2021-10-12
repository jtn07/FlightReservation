package com.notyetdecided.flightbooking.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationUpdateRequest {
    private long id;
    private boolean checkedIn;
    private int noOfBags;
}
