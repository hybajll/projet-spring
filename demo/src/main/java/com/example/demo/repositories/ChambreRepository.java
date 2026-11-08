package com.example.demo.repositories;

import com.example.demo.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {
    @Override
    List<Chambre> findAll();

    @Override
    Optional<Chambre> findById(Long id);

    @Override
    <S extends Chambre> S save(S entity);

    @Override
    void deleteById(Long id);

    @Override
    void delete(Chambre entity);

    @Override
    boolean existsById(Long id);

    @Override
    long count();

    @Override
    void deleteAll();
}


