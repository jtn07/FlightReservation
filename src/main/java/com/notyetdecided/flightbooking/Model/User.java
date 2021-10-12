package com.notyetdecided.flightbooking.Model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNullFields;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="usertable")
public class User extends AbstractEntity {


    @Column(nullable = false)
    private  String firstName;
    @Column(nullable = false)
    private @NotNull String lastName;
    @Column(nullable = false)
    private @NotNull String email;
    @Column(nullable = false)
    private @NotNull String password;

}
