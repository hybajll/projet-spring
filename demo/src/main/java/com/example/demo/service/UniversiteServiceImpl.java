package com.example.demo.service;

import com.example.demo.entities.Universite;
import com.example.demo.repositories.UniversiteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UniversiteServiceImpl implements IUniversiteService {
    private final UniversiteRepository universiteRepository;

    public UniversiteServiceImpl(UniversiteRepository universiteRepository) { this.universiteRepository = universiteRepository; }

    @Override public List<Universite> retrieveAllUniversites() { return universiteRepository.findAll(); }
    @Override public Universite retrieveUniversite(Long id) {
        return universiteRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Université introuvable : " + id));
    }
    @Override public Universite addUniversite(Universite universite) { return universiteRepository.save(universite); }
    @Override public void removeUniversite(Long id) { universiteRepository.deleteById(id); }
    @Override public Universite modifyUniversite(Universite universite) { return universiteRepository.save(universite); }
}
