package com.notyetdecided.flightbooking.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CollectionId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Flight")
public class Flight extends AbstractEntity {

    @Column
    private String flightNumber;
    @Column
    private String operatingAirlines;
    @Column
    private String departureCity;
    @Column
    private String arrivalCity;
    @Column
    private Date dateOfDeparture;
    @Column
    private Timestamp estimatedDepartureTime;

}
