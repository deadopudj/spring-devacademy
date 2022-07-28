package dev.springframework.springwebapp.repositories;

import dev.springframework.springwebapp.domain.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository <Reservation, Long>{
}
