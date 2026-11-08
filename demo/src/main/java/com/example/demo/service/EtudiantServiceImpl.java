package com.example.demo.service;

import com.example.demo.entities.Etudiant;
import com.example.demo.repositories.EtudiantRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EtudiantServiceImpl implements IEtudiantService {
    private final EtudiantRepository etudiantRepository;

    public EtudiantServiceImpl(EtudiantRepository etudiantRepository) { this.etudiantRepository = etudiantRepository; }

    @Override public List<Etudiant> retrieveAllEtudiants() { return etudiantRepository.findAll(); }
    @Override public Etudiant retrieveEtudiant(Long id) {
        return etudiantRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Étudiant introuvable : " + id));
    }
    @Override public Etudiant addEtudiant(Etudiant etudiant) { return etudiantRepository.save(etudiant); }
    @Override public void removeEtudiant(Long id) { etudiantRepository.deleteById(id); }
    @Override public Etudiant modifyEtudiant(Etudiant etudiant) { return etudiantRepository.save(etudiant); }
}
