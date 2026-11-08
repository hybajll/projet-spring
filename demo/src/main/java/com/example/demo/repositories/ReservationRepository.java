package com.example.demo.repositories;

import com.example.demo.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, String> {
    @Override
    List<Reservation> findAll();

    @Override
    Optional<Reservation> findById(String id);

    @Override
    <S extends Reservation> S save(S entity);

    @Override
    void deleteById(String id);

    @Override
    void delete(Reservation entity);

    @Override
    boolean existsById(String id);

    @Override
    long count();

    @Override
    void deleteAll();
}


