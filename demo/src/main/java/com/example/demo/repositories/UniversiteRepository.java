package com.example.demo.repositories;

import com.example.demo.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite, Long> {
    @Override
    List<Universite> findAll();

    @Override
    Optional<Universite> findById(Long id);

    @Override
    <S extends Universite> S save(S entity);

    @Override
    void deleteById(Long id);

    @Override
    void delete(Universite entity);

    @Override
    boolean existsById(Long id);

    @Override
    long count();

    @Override
    void deleteAll();
    @Override
    List<Universite> findAllById(Iterable<Long> longs);
}


