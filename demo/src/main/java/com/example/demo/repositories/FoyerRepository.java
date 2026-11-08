package com.example.demo.repositories;

import com.example.demo.entities.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer, Long> {
    @Override
    List<Foyer> findAll();

    @Override
    Optional<Foyer> findById(Long id);

    @Override
    <S extends Foyer> S save(S entity);

    @Override
    void deleteById(Long id);

    @Override
    void delete(Foyer entity);

    @Override
    boolean existsById(Long id);

    @Override
    long count();

    @Override
    void deleteAll();
}


