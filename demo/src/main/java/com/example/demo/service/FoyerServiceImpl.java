package com.example.demo.service;

import com.example.demo.entities.Foyer;
import com.example.demo.repositories.FoyerRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FoyerServiceImpl implements IFoyerService {
    private final FoyerRepository foyerRepository;

    public FoyerServiceImpl(FoyerRepository foyerRepository) { this.foyerRepository = foyerRepository; }

    @Override public List<Foyer> retrieveAllFoyers() { return foyerRepository.findAll(); }
    @Override public Foyer retrieveFoyer(Long id) {
        return foyerRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Foyer introuvable : " + id));
    }
    @Override public Foyer addFoyer(Foyer foyer) { return foyerRepository.save(foyer); }
    @Override public void removeFoyer(Long id) { foyerRepository.deleteById(id); }
    @Override public Foyer modifyFoyer(Foyer foyer) { return foyerRepository.save(foyer); }
}
