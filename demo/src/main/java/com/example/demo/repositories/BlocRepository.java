package com.example.demo.repositories;

import com.example.demo.entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BlocRepository extends JpaRepository<Bloc, Long> {
    @Override
    List<Bloc> findAll();

    @Override
    Optional<Bloc> findById(Long id);

    @Override
    <S extends Bloc> S save(S entity);

    @Override
    void deleteById(Long id);

    @Override
    void delete(Bloc entity);

    @Override
    boolean existsById(Long id);

    @Override
    long count();

    @Override
    void deleteAll();
}


