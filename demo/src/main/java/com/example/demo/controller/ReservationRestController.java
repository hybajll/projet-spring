package com.example.demo.controller;

import com.example.demo.entities.Reservation;
import com.example.demo.service.IReversationService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationRestController {
    private final IReversationService reservationService;

    public ReservationRestController(IReversationService reservationService) { this.reservationService = reservationService; }

    @GetMapping("/retrieve-all-reservations")
    public List<Reservation> getReservations() { return reservationService.retrieveAllReservations(); }

    @GetMapping("/retrieve-reservation/{reservation-id}")
    public Reservation retrieveReservation(@PathVariable("reservation-id") String id) { return reservationService.retrieveReservation(id); }

    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation reservation) { return reservationService.addReservation(reservation); }

    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void removeReservation(@PathVariable("reservation-id") String id) { reservationService.removeReservation(id); }

    @PutMapping("/modify-reservation")
    public Reservation modifyReservation(@RequestBody Reservation reservation) { return reservationService.modifyReservation(reservation); }
}
