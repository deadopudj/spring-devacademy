package dev.springframework.springwebapp.controllers;

import dev.springframework.springwebapp.repositories.ReservationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReservationController {

    private final ReservationRepository reservationRepository;

    public ReservationController (ReservationRepository reservationRepository){
        this.reservationRepository = reservationRepository;
    }

    @RequestMapping("/api/accommodation")
    public String getReservations(Model model){

        model.addAttribute("reservations", reservationRepository.findAll());

        return "reservations";
    }
}
