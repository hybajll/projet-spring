package com.example.demo.service;

import com.example.demo.entities.Chambre;
import com.example.demo.repositories.ChambreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChambreServiceImpl implements IChambreService {

    private final ChambreRepository chambreRepository;

    public ChambreServiceImpl(ChambreRepository chambreRepository) {
        this.chambreRepository = chambreRepository;
    }

    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre retrieveChambre(Long chambreId) {
        return chambreRepository.findById(chambreId)
                .orElseThrow(() -> new IllegalArgumentException("Chambre introuvable : " + chambreId));
    }

    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void removeChambre(Long chambreId) {
        chambreRepository.deleteById(chambreId);
    }

    @Override
    public Chambre modifyChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }
}
