package com.example.demo.service;

import com.example.demo.entities.Reservation;
import com.example.demo.repositories.ReservationRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReservationServiceImpl implements IReversationService {
    private final ReservationRepository reservationRepository;

    public ReservationServiceImpl(ReservationRepository reservationRepository) { this.reservationRepository = reservationRepository; }

    @Override public List<Reservation> retrieveAllReservations() { return reservationRepository.findAll(); }
    @Override public Reservation retrieveReservation(String id) {
        return reservationRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Réservation introuvable : " + id));
    }
    @Override public Reservation addReservation(Reservation reservation) { return reservationRepository.save(reservation); }
    @Override public void removeReservation(String id) { reservationRepository.deleteById(id); }
    @Override public Reservation modifyReservation(Reservation reservation) { return reservationRepository.save(reservation); }
}
