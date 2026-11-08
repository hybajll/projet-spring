package com.example.demo.service;

import com.example.demo.entities.Reservation;
import java.util.List;

public interface IReversationService {
    List<Reservation> retrieveAllReservations();
    Reservation retrieveReservation(String id);
    Reservation addReservation(Reservation reservation);
    void removeReservation(String id);
    Reservation modifyReservation(Reservation reservation);
}
