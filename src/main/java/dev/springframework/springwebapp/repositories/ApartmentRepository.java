package dev.springframework.springwebapp.repositories;

import dev.springframework.springwebapp.domain.Apartment;
import org.springframework.data.repository.CrudRepository;

public interface ApartmentRepository extends CrudRepository <Apartment, Long> {
}
