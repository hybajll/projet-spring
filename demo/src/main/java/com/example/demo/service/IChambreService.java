package com.example.demo.service;

import com.example.demo.entities.Chambre;

import java.util.List;

public interface IChambreService {

    List<Chambre> retrieveAllChambres();

    Chambre retrieveChambre(Long chambreId);

    Chambre addChambre(Chambre chambre);

    void removeChambre(Long chambreId);

    Chambre modifyChambre(Chambre chambre);
}
