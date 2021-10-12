package com.notyetdecided.flightbooking.Repositories;

import com.notyetdecided.flightbooking.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail( String email);

}
