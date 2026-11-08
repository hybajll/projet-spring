package com.example.demo.repositories;

import com.example.demo.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Date;
import java.util.Optional;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    @Override
    List<Etudiant> findAll();

    @Override
    Optional<Etudiant> findById(Long id);

    @Override
    <S extends Etudiant> S save(S entity);

    @Override
    void deleteById(Long id);

    @Override
    void delete(Etudiant entity);

    @Override
    boolean existsById(Long id);

    @Override
    long count();

    @Override
    void deleteAll();
    List<Etudiant> findByDateNaissanceBetween(Date startDate, Date endDate);
}


