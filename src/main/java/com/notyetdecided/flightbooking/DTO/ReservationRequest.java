package com.notyetdecided.flightbooking.DTO;


import lombok.Data;

@Data

public class ReservationRequest {
    private long flightId;
    private String passengerFirstName;
    private String passengerLastName;
    private String passengerEmail;
    private String passengerPhone;
    private String nameOnTheCard;private String cardNumber;
    private String expirationDate;private String securityCode;
}
