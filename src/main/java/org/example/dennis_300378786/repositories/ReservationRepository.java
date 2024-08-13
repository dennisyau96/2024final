package org.example.dennis_300378786.repositories;

import org.example.dennis_300378786.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

//    List<Reservation> findReservationByIdById (long kw);

}
