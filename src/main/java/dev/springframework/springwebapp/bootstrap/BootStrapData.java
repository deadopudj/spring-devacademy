package dev.springframework.springwebapp.bootstrap;

import dev.springframework.springwebapp.domain.Apartment;
import dev.springframework.springwebapp.domain.Reservation;
import dev.springframework.springwebapp.repositories.ApartmentRepository;
import dev.springframework.springwebapp.repositories.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final ApartmentRepository apartmentRepository;
    private final ReservationRepository reservationRepository;

    public BootStrapData(ApartmentRepository apartmentRepository, ReservationRepository reservationRepository) {
        this.apartmentRepository = apartmentRepository;
        this.reservationRepository = reservationRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Apartment villasungarden = new Apartment("VIlla Sun Garden", "Small villa", "Villa Sun Garden smještena je 50m od mora.", "apartman", 5);
        Reservation one = new Reservation(1, 2550, true);

        villasungarden.
    }
}
